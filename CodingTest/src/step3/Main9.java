package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 9번 문제
*/
public class Main9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}