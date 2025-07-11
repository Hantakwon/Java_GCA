package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 1번 문제
*/
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();

		for(int i=1; i<10; i++) {
			System.out.println(x + " * " + i + " = " + (x*i));
		}
			
		scanner.close();
	}
}