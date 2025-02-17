package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBMS에 접근하는 중복되 작업을 정의할 클래스
public class DBUtil {
	// 드라이버 로딩은 클래스가 로딩될때 같이 로딩되도록 처리 (Static)
	// -> static{}안의 명령문은 클래스가 로딩될때 한 번만 실행되는 코드
	static {

		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패..");
		} 
	
	}
	//2. 커넥션하기 - DBMS와 접속 후에 접속 정보를 저장하고 있는 Connection을 리턴
	public static Connection getConnect() throws SQLException {	//모든 객체에서 같은 동작을 하기때문에 static으로 정의
		Connection con=null;
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("연결성공!!");
		
		
		return con;
	}
	public static void close(ResultSet rs, Statement stmt, Connection con) {
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
