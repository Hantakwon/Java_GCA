package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 8번 문제
*/
public class Main8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int[] x = new int[count];
		int[] y = new int[count];
		
		for(int i=0; i<count; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}
		
		for(int i=0; i<count; i++) {
			System.out.println("Case #" + (i+1) + ": " + x[i] + " + " + y[i] + " = " + (x[i] + y[i]));
		}
		
		scanner.close();
			
	}
}