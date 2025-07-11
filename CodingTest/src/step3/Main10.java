package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 10번 문제
*/
public class Main10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}