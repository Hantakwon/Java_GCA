package step6;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 6단계 2번 문제
*/
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] count = { 1, 1, 2, 2, 2, 8 };
		
		for(int i=0; i<count.length; i++) {
			int num = scanner.nextInt();
			System.out.print(count[i] - num + " ");
		}
		
		scanner.close();
	}
}
