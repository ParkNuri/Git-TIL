package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//deleteTest.java
//updatetestjava�� rename�ؼ� �۾� sql���� delete������ �����ؼ� ������ ����
	//	3 boardnum �Խù� ����
//[�������]
//1���� ����
public class DeleteTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		
		StringBuffer sql = new StringBuffer("delete tb_board ");
		sql.append("where boardnum=3");	// �ټ��� �������ٽ� �޸� ������ ���� StringBuffer���
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!");
			Statement stmt = con.createStatement();
			stmt.executeQuery(sql.toString());	// or (sql+"") // StringBuffer -> String
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
			
	}

}
