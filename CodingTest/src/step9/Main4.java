package step9;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 9단계 4번 문제
*/
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int sum = 0;
		
		for(int i=0; i<count; i++) {
			int num = scanner.nextInt();
			boolean isDecimal = true;
			if(num > 1) {
				for(int j=2; j<num; j++) {
					if (num % j == 0) {
						isDecimal = false;
					}
				}
			} else isDecimal = false;
			
			if(isDecimal) sum++;
		}
		
		System.out.println(sum);
		
		
		scanner.close();
	}
}
