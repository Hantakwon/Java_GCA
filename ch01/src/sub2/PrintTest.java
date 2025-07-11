package sub2;

/*
	날짜 : 2025/07/07
	이름 : 한탁원
	내용 : Java 다양한 출력 실습
*/
public class PrintTest {
	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java!");  // 한줄복사 : Ctrl + Alt + 방향키 아래(위)		
		System.out.println("Hello Korea!");	// 한줄삭제 : Ctrl + d
		System.out.println("Hello Busan!");	// 작업취소 : Ctrl + z
		
		// 한출 출력
		System.out.print("Welcome");		// ln(줄바꿈) 처리가 안되기 때문에 그 다음 출력문이 바로 이어서 출력됨
		System.out.print("Java!");		
		
		// 개행 출력
		System.out.println(); 				// 줄바꿈		
		System.out.print("Welcome\n");		// \n : 개행처리 이스케이ㄴ프 특수문자	
		System.out.print("Korea!");			
	}
}
