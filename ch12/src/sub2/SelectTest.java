package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
* 날짜 : 2025/07/25
* 이름 : 한탁원
* 내용 : 자바 Select 실습하기
*/
public class SelectTest {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// DB 정보
		final String host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user = "gca1234";
		final String pass = "1234";

		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<User1VO>();
		
		try {
			// 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			stmt = null;
			rs = null;
			
			// SQL 실행 객체 생성(Statement, PreparedStatement)
			stmt = conn.createStatement();

			// SQL 실행
			String query = "SELECT * FROM USER1";
			rs = stmt.executeQuery(query); // SELECT문의 executeQuery()으로 실행하고 ResultSet 반환
		
			// 결과처리(일반적으로 리스트 생성)
			while(rs.next()) { // 커서를 다음 ROw로 이동시킴, 이동할 Row가 없으면 false
				
				// 커서가 가리키는 Row의 각 컬럼값을 추출해서 VO 객체 초기화
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString("USER_ID"));
				vo.setName(rs.getString("NAME"));
				vo.setHp(rs.getString("HP"));
				vo.setAge(rs.getInt("AGE"));
				
				// 리스트 삽입
				users.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 데이터베이스 종료
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 출력
		for(User1VO user1 : users) {
			System.out.println(user1);
		}
		
	}

}
