package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 1번 문제
*/
public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		int num = scanner.nextInt();
		
		System.out.print(s.charAt(num-1));
		
		scanner.close();
	}
}
