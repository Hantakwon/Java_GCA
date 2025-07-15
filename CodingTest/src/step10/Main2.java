package step10;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 10단계 2번 문제
*/
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		int xValue = x2 - x > x - 0 ? x - 0 : x2 - x;
		int yValue = y2 - y > y - 0 ? y - 0 : y2 - y;
		
		if(xValue > yValue) {
			System.out.println(yValue);
		} else System.out.println(xValue);
		
		scanner.close();
	}
}
