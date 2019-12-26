package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//deleteTest.java
//updatetestjava�� rename�ؼ� �۾� sql���� delete������ �����ؼ� ������ ����
	//	3 boardnum �Խù� ����
//[�������]
//1���� ����
public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		PreparedDeleteTest obj = new PreparedDeleteTest();
		
		System.out.print("������ �Խù� ��ȣ : ");
		int boardNum = key.nextInt();
		
		obj.delete(boardNum);
	}
		public void delete(int boardNum) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		
		StringBuffer sql = new StringBuffer("delete tb_board ");
		sql.append("where boardnum=?");	// �ټ��� �������ٽ� �޸� ������ ���� StringBuffer���
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!");
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
			stmt.executeQuery();	// or (sql+"") // StringBuffer -> String
			System.out.println("1�� �� ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����..");
			e.printStackTrace();//��������
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� �ε� ����..");
			e.printStackTrace();
		}finally {
			try { 
				 
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
