package step3;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 3단계 4번 문제
*/
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price = scanner.nextInt();
		int count = scanner.nextInt();
		int[] x = new int[count];
		int[] y = new int[count];
		int sum = 0;
		
		for(int i=0; i<count; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}
		
		for(int i=0; i<count; i++) {
			sum += (x[i]*y[i]);
		}
		
		if(price == sum) {
			System.out.print("Yes");
		} else
			System.out.print("No");
		
		scanner.close();
	}
}