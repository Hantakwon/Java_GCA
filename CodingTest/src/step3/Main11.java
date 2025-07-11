package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 11번 문제
*/
public class Main11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNext()) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println(A+B);
		}
		
		scanner.close();
	}
}