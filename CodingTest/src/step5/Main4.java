package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 4번 문제
*/
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		scanner.nextLine(); 
		
		for(int i=0; i<count; i++) {
			String s = scanner.nextLine();
			System.out.println(String.valueOf(s.charAt(0)) +String.valueOf( s.charAt(s.length()-1)));
		}
		
		scanner.close();
	}
}
