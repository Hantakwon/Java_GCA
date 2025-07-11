package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 9번 문제
*/
public class Main9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		x = Integer.parseInt(new StringBuilder().append(x).reverse().toString());
		y = Integer.parseInt(new StringBuilder().append(y).reverse().toString());
		
		System.out.print(x > y ? x : y);
		
		scanner.close();
	}
}