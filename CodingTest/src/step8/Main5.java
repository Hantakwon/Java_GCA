package step8;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 8단계 5번 문제
*/

/*	
  1 1
  2 2~7 6
  3 8~19 12
  4 20~37 18
  5 38~61 24
*/
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int i = 0;

		if (num == 1) {
			System.out.print("1");
		} else {
			num--;
			while (num > 0) {
				num -= (6 * i);
				i++;
			}
			System.out.println(i);
		}

		scanner.close();
	}
}
