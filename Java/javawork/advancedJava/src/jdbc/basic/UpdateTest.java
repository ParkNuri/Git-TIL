package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// ���� �ڵ��ؼ� �۾��ϱ�
// 2�� boardnum �� id�� kang���� ����

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		String sql = "Update tb_board set ID ='kang' where boardnum=2";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!");
			Statement stmt = con.createStatement();
			stmt.executeQuery(sql);
			System.out.println("1�� �� ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����..");
			e.printStackTrace();//��������
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� �ε� ����..");
			e.printStackTrace();
		}
			
			
		 /*catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� �ε� ����..");
		} catch (SQLException e) {
		}
		*/
		
		// TODO Auto-generated method stub
	
	}

}
