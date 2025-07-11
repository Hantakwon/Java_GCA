package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 5번 문제
*/
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int basketCount = scanner.nextInt();
		int[] basket = new int[basketCount];
		int count = scanner.nextInt();
		
		for(int i=0; i<count; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			for(int j=x-1; j<=y-1; j++) {
				basket[j] = z;
			}
		}
		
		for(int i=0; i<basket.length; i++) {
			System.out.print(basket[i] + " ");
		}
		
		scanner.close();
	}
}
