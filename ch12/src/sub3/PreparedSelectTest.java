package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

/*
* 날짜 : 2025/07/25
* 이름 : 한탁원
* 내용 : PreparedStatement 실습하기
*/
public class PreparedSelectTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// DB 정보
		final String host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user = "gca1234";
		final String pass = "1234";

		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<User1VO>();

		// 데이터베이스 접속
		try {
			conn = DriverManager.getConnection(host, user, pass);

			// SQL 실행 객체 생성(Statement, PreparedStatement)
			String query = "SELECT * FROM USER1 WHERE AGE >= ?"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리)
			psmt = conn.prepareStatement(query);

			psmt.setInt(1, 20); // 1번째 쿼리파라미터(?)에 나이 숫자 20 바인딩

			// SQL 실행
			rs = psmt.executeQuery(); // SELECT 실행하기 때문에 executeQuery()로 실행하여 ResultSet 반환됨

			// 결과처리(SELECT문일 경우)
			while (rs.next()) {
				// VO 객체 생성 : VO 객체는 데이터베이스에서 조회된 결과를 초기화된 읽기전용 오브젝트(객체)
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
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 출력
		for (User1VO user1 : users) {
			System.out.println(user1);
		}

	}

}
