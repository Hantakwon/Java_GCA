package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 4번 문제
*/
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] x = new int[9];
		
		for(int i=0; i<x.length; i++) {
			x[i] = scanner.nextInt();
		}
		
		int max = x[0];
		int count = 1;
		
		for(int i=1; i<x.length; i++) {
			if(max < x[i]) {
				max = x[i];
				count = i+1;
			} 
		}
		
		System.out.println(max);
		System.out.println(count);
		
		scanner.close();
	}
}
