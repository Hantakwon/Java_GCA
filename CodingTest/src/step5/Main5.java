package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 5번 문제
*/
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		scanner.nextLine();
		String num = scanner.nextLine();
		int sum = 0;
		
		for(int i=0; i<count; i++) {
			sum += num.charAt(i) - '0' ;
		}
		
		System.out.print(sum);
		
		scanner.close();
	}
}
