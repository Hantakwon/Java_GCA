package step8;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 8단계 3번 문제
*/
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int change[] = new int[4];
		
		for(int i=0; i<count; i++) {
			int money = scanner.nextInt();
			
			change[0] = money / 25;
			change[1] = (money % 25) / 10;
			change[2] = (money % 25 % 10) / 5;
			change[3] = (money % 25 % 10 % 5) / 1;
			
			for(int j : change) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
