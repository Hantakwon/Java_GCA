package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* 날짜 : 2025/07/25
* 이름 : 한탁원
* 내용 : PreparedStatement 실습하기
*/
public class PreparedInsertTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;

		// DB 정보
		final String host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user = "gca1234";
		final String pass = "1234";

		// 데이터베이스 접속
		try {
			conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성(Statement, PreparedStatement)
			String query = "INSERT INTO USER1 VALUES (?, ?, ?, ?)"; // 쿼리 파라미터를 사용한 SQL(준비도니 쿼리)
			psmt = conn.prepareStatement(query);

			psmt.setString(1, "P101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);
			
			// SQL 실행
			psmt.executeUpdate();
			
			// 결과처리(SELECT문일 경우)
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 데이터베이스 종료
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
