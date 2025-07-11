package step2;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 2단계 5번 문제
*/
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt();
		int m = scanner.nextInt();
	
		if(m >= 45) {
			System.out.print(h + " " + (m-45));
		} else if(h == 0) {
			System.out.print(((h+24)-1) + " " + ((m+60)-45));
		} else
			System.out.print((h-1) + " " + ((m+60)-45));
			
		scanner.close();
	}
}