package step7;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 7단계 1번 문제
*/
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int[][] array1 = new int[x][y];
		int[][] array2 = new int[x][y];
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				array1[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				array2[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.print((array1[i][j] + array2[i][j]) + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
