package step8;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 8단계 7번 문제
*/
public class Main7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();

		int day = (V - B) / (A - B);

		if ((V - B) % (A - B) != 0) {
			day++;
		}
		
		System.out.println(day);
		
		scanner.close();
	}
}
