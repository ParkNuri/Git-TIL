package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	//127.0.0.1 = localhost = ���� �۾� ���� �� pc
	public static void main(String[] args) {
		//���� ���ڿ� - � DBMS�� �����Ŀ� ���� ������ �޶�����.
		//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.55:1521:xe";	//¦ ������
		String url = "jdbc:oracle:thin:@70.12.115.89:1521:xe";
		//���ݿ� �ִ� ���� DB���� IP ���� ����
		//���Ӱ���
		String user = "scott";
		//������ ������ �н�����
		String password = "tiger";
		try {
			//1. ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver"); //forname �޼ҵ带 ���� Ŭ������ static������ �÷���
			System.out.println("����̹��ε� ����!!");
			//2. DBMS�� �����ϱ� - ���������� ����
			// ==> DBMS�� �����ϰ� ���������� ConnectionŸ������ ��ȯ
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��!:"+conn); //oracle.jdbc.driver.T4CConnection ���� ����Ŭ�� ����Ǵ� ��ü ����  .. ����ϴ� DB�� ��ü�� ����
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("�������:"+e.getMessage());
		}
	}

}
