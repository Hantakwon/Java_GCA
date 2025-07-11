package step7;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 7단계 4번 문제
*/
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] array = new int[100][100];
		int sum = 0;
		int num = scanner.nextInt();
		
		for(int i=0; i<num; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					array[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
		
		System.out.print(sum);
		
		scanner.close();
	}
}
