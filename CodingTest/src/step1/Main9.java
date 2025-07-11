package step1;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 1단계 9번 문제
*/
public class Main9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println((A+B)%C);	
		System.out.println(((A%C) + (B%C))%C);	
		System.out.println((A*B)%C);	
		System.out.println(((A%C)*(B%C))%C);	
		
		scanner.close();
	}
}
