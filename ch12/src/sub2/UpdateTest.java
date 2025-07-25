package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* 날짜 : 2025/07/25
* 이름 : 한탁원
* 내용 : 자바 Update 실습하기
*/
public class UpdateTest {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		// ResultSet rs = null;

		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "gca1234";
		String pass = "1234";

		try {
			// 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성(Statement, PreparedStatement)
			stmt = conn.createStatement();

			// SQL 실행
			String query = "UPDATE USER1 SET AGE=35 WHERE USER_ID='J101'";;
			stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 데이터베이스 종료
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Update 완료...");
	}

}
