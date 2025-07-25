package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* 날짜 : 2025/07/25
* 이름 : 한탁원
* 내용 : 자바 Insert 실습하기
*/
public class InsertTest {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "gca1234";
		String pass = "1234";

		// 데이터베이스 접속
		try {
			conn = DriverManager.getConnection(host, user, pass);
			stmt = null;
			// SQL 실행 객체 생성(Statement, PreparedStatement)
			stmt = conn.createStatement();

			// SQL 실행
			String query = "INSERT INTO USER1 VALUES ('J101', '김유신', '010-1212-2221', 31)";
			stmt.executeUpdate(query);
			
			/*
			// 결과처리(SELECT문일 경우)
			while(rs.next()) { 
				int deptNo = rs.getInt("DEPTNO");
				String deptName = rs.getString("DNAME");
				String detpTel = rs.getString("DTEL");
				
				// 출력
				System.out.println(deptNo + ", " + deptName + ", " + detpTel);
			}
			*/
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

	}

}
