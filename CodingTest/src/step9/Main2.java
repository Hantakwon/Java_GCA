package step9;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 9단계 2번 문제
*/
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int count = 0;
		int i;
		
		for(i=1; i<=num1; i++) {
			if(num1 % i == 0) {
				count++;
			}
			if(count == num2) {
				break;
			}
		}
		
		if(count < num2) {
			System.out.println(0);
		} else {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
