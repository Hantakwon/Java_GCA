package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 10번 문제
*/
public class Main10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sentence = scanner.nextLine();
		int count = 0;
		
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) == 'A' || sentence.charAt(i) == 'B' || sentence.charAt(i) == 'C') {
				count += 3;
			}else if(sentence.charAt(i) == 'D' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'F') {
				count += 4;
			}else if(sentence.charAt(i) == 'G' || sentence.charAt(i) == 'H' || sentence.charAt(i) == 'I') {
				count += 5;
			}else if(sentence.charAt(i) == 'J' || sentence.charAt(i) == 'K' || sentence.charAt(i) == 'L') {
				count += 6;
			}else if(sentence.charAt(i) == 'M' || sentence.charAt(i) == 'N' || sentence.charAt(i) == 'O') {
				count += 7;
			}else if(sentence.charAt(i) == 'P' || sentence.charAt(i) == 'Q' || sentence.charAt(i) == 'R' || sentence.charAt(i) == 'S') {
				count += 8;
			}else if(sentence.charAt(i) == 'T' || sentence.charAt(i) == 'U' || sentence.charAt(i) == 'V') {
				count += 9;
			}else if(sentence.charAt(i) == 'W' || sentence.charAt(i) == 'X' || sentence.charAt(i) == 'Y' || sentence.charAt(i) == 'Z') {
				count += 10;
			}
		}
		
		System.out.print(count);
		
		scanner.close();
		
	}
}