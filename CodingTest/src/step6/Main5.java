package step6;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 6단계 5번 문제
*/
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] alpha = new int[26]; 
		String s = scanner.nextLine().toUpperCase();
	
		for(int i=0; i<s.length(); i++) {
			alpha[s.charAt(i)-'A'] += 1 ;
		}
		
		int max = alpha[0];
		int maxLocation = 0;
		
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				maxLocation = i;
			}
		}
		
		int count = 0;
		
		for(int i=0; i<alpha.length; i++) {
			if(max == alpha[i]) {
				count += 1;
			}
		}
		
		if(count >= 2) {
			System.out.print("?");
		} else System.out.print(Character.toString(maxLocation + 'A'));
	
		scanner.close();
	}
}