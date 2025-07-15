package step9;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 9단계 5번 문제
*/
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int sum = 0;
		int min = end;
		
		for(int i=start; i<=end; i++) {
			boolean isDecimal = true;
			if(i > 1) {
				for(int j=2; j<i; j++) {
					if (i % j == 0) {
						isDecimal = false;
					}
				}
			} else isDecimal = false;
			
			if(isDecimal) {
				if(min > i) {
					min = i;
				}
				sum += i;
			}
		}
		
		
		if(sum != 0 ) {
			System.out.println(sum);
			System.out.println(min);
		} else System.out.println(-1);
		
		
		scanner.close();
	}
}
