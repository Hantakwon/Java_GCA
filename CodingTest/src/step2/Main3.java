package step2;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 2단계 3번 문제
*/
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.print("1");
		} else System.out.print("0");
		
		scanner.close();
	}
}