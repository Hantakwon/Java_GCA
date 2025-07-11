package sub3;

/*
날짜 : 2025/07/08
이름 : 한탁원
내용 : 자바 for 반복문 실습하기
*/
public class ForTest {
	public static void main(String[] args) {
		
		// for 기본
		for(int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
		}
		
		// 1부터 10까지의 합
		int sum = 0;
		
		for(int k = 0; k <=10; k++) {
			sum += k;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		// 1부터 10까지의 짝수합
		int tot = 0;
		
		for(int k = 0; k <=10; k++) {
			if(k % 2 == 0)
				tot += k;
		}
		System.out.println("1부터 10까지의 짝수합 : " + tot);
		
		// for 중첩
		for(int a=1; a<=3; a++) {
			System.out.println();
			System.out.print("a : " + a);
			System.out.println();
			for(int b=1; b<=5; b++) {
				System.out.print("b : " + b + "\t");
			}
		}
		
		// 구구단
		for(int x=1; x<=9; x++) {
			System.out.println();
			System.out.println(x + "단");
			for(int y=1; y<=9; y++) {
				int z = x*y;
				//System.out.println(x + " * " + y + " = " + z);
				System.out.printf("%d * %d = %d \t", x, y, z);
			}
		}
		System.out.println();
		
		
		// 별삼각형
		for(int start=10; start>=1; start--) {
			for(int end=1; end<=start; end++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
	}
}
