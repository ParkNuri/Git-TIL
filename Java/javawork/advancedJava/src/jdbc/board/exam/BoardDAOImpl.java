package jdbc.board.exam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public int insert(BoardDTO board) {
		Connection con = null;
		PreparedStatement stmt = null;

		int result = 0;

		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, board.getId());
			stmt.setString(2, board.getTitle());
			stmt.setString(3, board.getContent());

			result = stmt.executeUpdate();
			System.out.println("1 �� �� ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { // null check �ʼ�!!!!
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;

		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);

			result = stmt.executeUpdate();
			System.out.println("1 �� �� ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}

		return result;
	}

	@Override
	public int update(int boardNum, String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;

		String sql = "Update tb_board set ID =? where boardnum=?";

		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);

			stmt.executeQuery();
			System.out.println("1�� �� ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}

	@Override
	public int delete(int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;

		int result = 0;

		StringBuffer sql = new StringBuffer("delete tb_board ");
		sql.append("where boardnum=?");

		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
			stmt.executeQuery();
			System.out.println("1�� �� ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}

		return result;
	}

	// ��ȸ�� ����� ArrayList�� ��ȯ�Ͽ� ����
	@Override
	public ArrayList<BoardDTO> select() {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnect();
			// select�� ����
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {// ���ڵ带 ��ȸ�ϱ� ���ؼ���
				// 1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
				boardlist.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
	}

	@Override
	public BoardDTO read(int boardnum) {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		String sql = "select * from tb_board where boardnum=?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnect();
			// select�� ����
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, boardnum);
			rs = stmt.executeQuery();
			rs.next();
			board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6));
			boardlist.add(board);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, con);
		}
		return board;
	}

	@Override
	public ArrayList<BoardDTO> findByTitle(String title) {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		String sql = "select * from tb_board where title like ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnect();
			// select�� ����
			stmt = con.prepareStatement(sql);
			stmt.setString(1, '%'+title+'%');
			rs = stmt.executeQuery();
			while (rs.next()) {// ���ڵ带 ��ȸ�ϱ� ���ؼ���
				// 1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6));
				boardlist.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
	}

	@Override
	public int updateHit(int boardnum) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		String sql = "Update tb_board set hit = hit+1  where boardnum=?";
		int result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, boardnum);

			result = stmt.executeUpdate();
			System.out.println(result+"�� �� hit �� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
