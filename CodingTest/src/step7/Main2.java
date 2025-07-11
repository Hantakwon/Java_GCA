package step7;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 7단계 2번 문제
*/
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] array = new int[9][9];
		int max = 0;
		int maxI = 0;
		int maxJ = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j] > max) {
					max = array[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.print((maxI+1) + " " + (maxJ+1));
		
		scanner.close();
	}
}
