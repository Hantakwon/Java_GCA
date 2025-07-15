package step10;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 10단계 3번 문제
*/
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] coordinate1 = {scanner.nextInt(), scanner.nextInt()};
		int[] coordinate2 = {scanner.nextInt(), scanner.nextInt()};
		int[] coordinate3 = {scanner.nextInt(), scanner.nextInt()};
			
		int x, y;
		
		if(coordinate1[0] == coordinate2[0]) {
			x = coordinate3[0];
		}
		else if(coordinate1[0] == coordinate3[0]) {
			x = coordinate2[0];
		} else x = coordinate1[0];
		
		if(coordinate1[1] == coordinate2[1]) {
			y = coordinate3[1];
		}
		else if(coordinate1[1] == coordinate3[1]) {
			y = coordinate2[1];
		} else y = coordinate1[1];
		
		System.out.println(x + " " + y);
		
		scanner.close();
	}
}
