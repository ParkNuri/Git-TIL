package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("==========�Խñ� ���==========");
		System.out.print("���̵�: ");
		String id = s.next();
		System.out.print("����: ");
		String title = s.next();
		System.out.print("����: ");
		String content = s.next();
		
		obj.insert(id, title, content);
	}

	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";

		Connection con = null;
		PreparedStatement ptmt = null;
		// ResultSet rs = null;

//		String sql = "insert into tb_board values(1,'"+id+"','"+title+"','"+content+"',sysdate,0)";	// statement ��� 
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)"; // ���� sql	preparedStatement ��� �ܺο��� �Է¹��� ���� ? �� ǥ��
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��!!");
			
			//1. PreparedStatement ����
			ptmt=con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			//3. �����ϱ�
			int result = ptmt.executeUpdate();
			//System.out.println(result + "�� �� ���Լ���");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����..");
		} catch (SQLException e) {
			System.out.println("�������:" + e.getMessage());
		} finally { // exception�� �߻����� �ʰų� �߻��ϰ� �� ������ ������ ��ɹ��� ����
			// �ڿ� �ݳ�
			try { // null check �ʼ�!!!!
				// if(rs!=null)rs.close();
				if (ptmt != null)
					ptmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
