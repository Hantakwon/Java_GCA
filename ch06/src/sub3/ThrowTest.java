package sub3;

/*
 * 날짜 : 2025/07/21
 * 이름 : 한탁원
 * 내용 : 자바 예외 발생시키기 실습하기
 */
class MinusException extends Exception {
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	public OverException(String message) {
		super(message);
	}
}

class Score {
	public void check(int score) throws Exception {
		if(score < 0) {
			// 예외 발생 시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		}else if(score > 100) {
			// 예외 발생 시키기
			throw new OverException("점수는 100점을 넘을 수 없습니다.");
		}else {
			System.out.println("점수가 이상 없습니다.");
		}
	}
}
public class ThrowTest {
	public static void main(String[] args) {
		Score score = new Score();
	
		try {
			score.check(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
