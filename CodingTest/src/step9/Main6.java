package step9;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 9단계 6번 문제
*/
public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();		
		
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		if (num != 1) {
			System.out.println(num);
		}
		
		scanner.close();
	}
}
