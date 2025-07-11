package step2;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 2단계 1번 문제
*/
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		scanner.close();
		
		if (x > y)
			System.out.println(">");
		else if (x < y)
			System.out.println("<");
		else
			System.out.println("==");
			
	}
}