package step8;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 8단계 4번 문제
*/

/*
  0 2^2		
  1 3^3		1
  2 5^5		2
  3 9^9		4
  4 17^17	8
  5 33^33	16
*/
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int num2 = (int) (1 + Math.pow(2, num));
		
		System.out.print((int)Math.pow(num2, 2));
		scanner.close();
	}
}
