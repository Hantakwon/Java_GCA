package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 8번 문제
*/
public class Main8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] x = new int[10];
		int[] y = new int[10];
		int count = 10;
		
		for(int i=0; i<x.length; i++) {
			x[i] = scanner.nextInt();
			y[i] = x[i]%42;
		}
		
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(y[i] == y[j]) {
					count--;
					break;
				}
			}
		}
		
		System.out.print(count);
		
		scanner.close();
	}
}
