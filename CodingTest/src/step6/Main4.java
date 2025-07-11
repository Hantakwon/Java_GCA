package step6;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 6단계 4번 문제
*/
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
	
		String reverse = new StringBuilder().append(s).reverse().toString();
	
		if(s.equals(reverse)) {
			System.out.print("1");
		} else System.out.print("0");
		
		scanner.close();
	}
}