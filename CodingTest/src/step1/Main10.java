package step1;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 1단계 10번 문제
*/
public class Main10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		System.out.println(x * (y%10));
		System.out.println(x * ((y%100)/10));
		System.out.println(x * (y/100));
		System.out.println(x*y);
		
		scanner.close();
	}
}
