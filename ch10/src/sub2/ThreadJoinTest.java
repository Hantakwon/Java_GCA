package sub2;

/*
 * 날짜 : 2025/07/24
 * 이름 : 한탁원
 * 내용 : 파일 스레드 실습하기
 */
class WorkThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println("WorkThread - " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class WorkThread2 extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1; i<=12; i++) {
			System.out.println("WorkThread - " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadJoinTest {

	public static void main(String[] args) {
	
		WorkThread work = new WorkThread();
		WorkThread2 work2 = new WorkThread2();
		
		// 작업 스레드 실행
		work.start();
		work2.start();
		
		try {
			// 작업 스레드 종료 대기
			work.join();
			work2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
