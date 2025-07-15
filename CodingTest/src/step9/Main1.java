package step9;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 9단계 1번 문제
*/
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
			if(num1 > num2) {
				if (num1 % num2 == 0)	
					System.out.println("multiple");
				else System.out.println("neither");
			} else {
				if (num2 % num1 == 0)	
					System.out.println("factor");
				else System.out.println("neither");
			}
		}
		
		scanner.close();
	}
}
