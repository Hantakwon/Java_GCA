package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 3번 문제
*/
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int sum = 0;
		
		for(int i=1; i<=count; i++) {
			sum += i;
		}
		
		System.out.print(sum);
	
		scanner.close();
	}
}