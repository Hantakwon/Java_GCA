package sub3;

public class Calc {
	
	// 싱글톤(Singletion) 객체
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}

	private Calc() {} // 외부 new 동적 생성을 막기 위해 private 생성자 선언
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
}
