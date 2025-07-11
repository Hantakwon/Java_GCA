package step2;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 2단계 2번 문제
*/
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		scanner.close();
	}
}