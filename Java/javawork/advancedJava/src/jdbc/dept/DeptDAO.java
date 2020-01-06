package jdbc.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {
	
	public int insert(DeptDTO customer) {
		Connection con =null;
		PreparedStatement stmt = null;
		
		String sql ="insert into customer values(?,?,?,sysdate,0,?)";
		
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1,customer.getId()); 
			stmt.setString(2,customer.getPass()); 
			stmt.setString(3,customer.getName()); 
			stmt.setString(4,customer.getAddr()); 

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

	
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		String sql="update customer set addr = ? where id = ?";
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


	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		int result = 0;
		
		String sql = "delete customer where id = ?";
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
