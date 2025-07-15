package step10;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 10단계 4번 문제

1 4
2 8
3 12
4

*/
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Long num = scanner.nextLong();
		
		System.out.println(num*4);
		
		scanner.close();
	}
}
