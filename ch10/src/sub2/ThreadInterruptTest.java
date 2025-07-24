package sub2;

/*
 * 날짜 : 2025/07/24
 * 이름 : 한탁원
 * 내용 : 파일 스레드 상태 실습하기
 */
class SubThread extends Thread {

	@Override
	public void run() {
		int i = 1;

		try {
			while (true) {
				System.out.println("SubThread : " + i);
				i++;

				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadInterruptTest {

	public static void main(String[] args) {
		SubThread sub = new SubThread();
		
		// 작업 스레드 실행
		sub.start();
		
		try {
			// 메인스레드 (200)을 1초로 가정 10초 일시정지
			Thread.sleep(200 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생시키기
		sub.interrupt();
		
		System.out.println("프로그램 종료...");
	}

}
