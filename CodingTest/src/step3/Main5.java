package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 5번 문제
*/
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();

		for(int i=0; i<(n/4); i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
		scanner.close();
	}
}