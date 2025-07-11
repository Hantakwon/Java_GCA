package step2;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 2단계 4번 문제
*/
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x > 0 && y > 0) 
			System.out.print("1");
		else if(x < 0 && y > 0) 
			System.out.print("2");
		else if(x < 0 && y < 0) 
			System.out.print("3");
		else
			System.out.print("4");
		
		scanner.close();
	}
}