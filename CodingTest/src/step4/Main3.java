package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 3번 문제
*/
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int[] x = new int[count];
		
		for(int i=0; i<x.length; i++) {
			x[i] = scanner.nextInt();
		}
		
		int max = x[0];
		int min = x[0];
		
		for(int i=0; i<x.length-1; i++) {
			if(max < x[i+1]) {
				max = x[i+1];
			} 
			if(min > x[i+1]) {
				min = x[i+1];
			}
		}
		
		System.out.print(min + " " + max);
		
		scanner.close();
	}
}
