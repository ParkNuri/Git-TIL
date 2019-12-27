package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.basic.PreparedDeleteTest;

public class MemberDAOImpl implements MemberDAO {
	
	public MemberDAOImpl() {
		
	}

	@Override
	public int insert(MemberDTO user) {
		Connection con =null;
		PreparedStatement stmt = null;
		
		String sql ="insert into member values(?,?,?,?,?,sysdate,1000)";
		
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1,user.getId()); 
			stmt.setString(2,user.getPass()); 
			stmt.setString(3,user.getName()); 
			stmt.setString(4,user.getAddr()); 
			stmt.setString(5,user.getDeptno()); 

			System.out.println(sql);
			
			result = stmt.executeUpdate();
			System.out.println(result+" �� �� ���Լ���");
			
		} catch (SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		
		return result;
	}

	@Override
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		String sql="update member set addr = ? where id = ?";
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, addr);
			stmt.setString(2, id);
			
			result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		
		
		return result;
	}

	@Override
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		int result = 0;
		
		String sql = "delete member where id = ?";
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, id);
			
			result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		
		return result;
	}
	
}
