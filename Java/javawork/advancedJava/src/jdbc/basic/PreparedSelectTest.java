package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedSelectTest {
	public static void main(String[] args) {
		PreparedSelectTest obj = new PreparedSelectTest();

		obj.select();
	}

	public void select() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";

		String sql = "select * from tb_board";

		ResultSet rs = null;
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql);

			// select���� ����
			rs = stmt.executeQuery(sql);
			System.out.println("rs: " + rs); // oracle���� �����ϴ� resultset :
												// oracle.jdbc.driver.OracleResultSetImpl@2173f6d9
			// ResultSet�� ���ڵ尡 �����ϴ� ���� �ݺ��� ����
			while (rs.next()) { // ���ڵ带 ��ȸ�ϱ� ���ؼ��� ���ڵ尡 �Ѱ��� �ݵ�� Ŀ���� �̵����Ѿ��Ѵ�.
				// System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString("content") + "\t");
				// System.out.print(rs.getDate(5)+"\t");
				// System.out.println(rs.getInt(6));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
