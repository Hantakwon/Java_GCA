package step8;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 8단계 2번 문제
*/
public class Main2 {
	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		while (num1 > 0) {
			if (num1 % num2 >= 10) {
				sb.append((char) ((num1 % num2) + 55));
			} else {
				sb.append(num1 % num2);
			}

			num1 /= num2;
		}

		System.out.println(sb.reverse());
		
		scanner.close();
	}
}
