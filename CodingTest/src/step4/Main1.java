package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 1번 문제
*/
public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int[] x = new int[count];
		int sum = 0;
		
		for(int i=0; i<x.length; i++) {
			x[i] = scanner.nextInt();
		}
		
		int find = scanner.nextInt();
		
		for(int i=0; i<x.length; i++) {
			if(x[i] == find) {
				sum += 1;
			}
		}
		
		System.out.print(sum);
		
		scanner.close();
	}
}
