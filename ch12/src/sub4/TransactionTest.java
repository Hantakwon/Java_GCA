package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
* 날짜 : 2025/07/25
* 이름 : 한탁원
* 내용 : Transaction 실습하기
*/
public class TransactionTest {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생 하시겠습니까?");
		
		int answer = sc.nextInt();
		
		Connection conn = null;
		PreparedStatement psmt1 = null;
		PreparedStatement psmt2 = null;
		
		// DB 정보
		final String host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user = "BANK2";
		final String pass = "1234";

		// 데이터베이스 접속
		try {
			conn = DriverManager.getConnection(host, user, pass);
			
			// 자동 커밋 해제(트랜젝션 시작)
			conn.setAutoCommit(false);
			
			// SQL 실행 객체 생성(Statement, PreparedStatement)
			String query1 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANC - 10000 WHERE ACC_CID=?"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리)
			String query2 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANC + 10000 WHERE ACC_CID=?"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리)			

			psmt1 = conn.prepareStatement(query1);
			psmt1.setString(1, "730423-1000001");
			
			psmt2 = conn.prepareStatement(query2);
			psmt1.setString(1, "830513-2000003");
			// SQL 실행
			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("예기치 못한 에러가 발생했습니다.");
			}
			
			psmt1.executeUpdate();
			
			conn.commit();
			
			// 결과처리(SELECT문일 경우)
			
		} catch (SQLException e) {
			conn.rollback();
			
			e.printStackTrace();
		} finally {
			try {
				// 데이터베이스 종료
				psmt1.close();
				psmt2.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
