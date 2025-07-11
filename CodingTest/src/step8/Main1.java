package step8;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 8단계 1번 문제
*/
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		int num = scanner.nextInt();
		long result = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int cValue = 0;
			
			if (c >= '0' && c <= '9') {
				cValue = c - '0';
            } else { 
            	cValue = c - 'A' + 10;
            }
			
			result += cValue * Math.pow(num, s.length()-1-i); 
		}
		
		System.out.print(result);
		
		scanner.close();
	}
}
