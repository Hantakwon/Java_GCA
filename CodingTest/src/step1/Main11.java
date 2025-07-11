package step1;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 1단계 11번 문제
*/
public class Main11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Long x = scanner.nextLong();
		Long y = scanner.nextLong();
		Long z = scanner.nextLong();

		System.out.print(x+y+z);
		scanner.close();
	}
}
