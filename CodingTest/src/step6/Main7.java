package step6;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 6단계 7번 문제
*/
public class Main7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		scanner.nextLine();
		int sum = count;
		
		for(int i=0; i<count; i++) {
			String s = scanner.nextLine();
			int[] alpha = new int[26];
			char pre = s.charAt(0);
			alpha[pre - 'a'] += 1;
			for(int j=1; j<s.length(); j++) {
				if(pre != s.charAt(j)) {
					alpha[s.charAt(j) - 'a'] += 1;
				}
				pre = s.charAt(j);
			}
			
			for(int j=0; j<alpha.length; j++) {
				if(alpha[j] >= 2) {
					sum -= 1;
					break;
				}
			}
		}
		
		System.out.print(sum);
	
		scanner.close();
	}
}