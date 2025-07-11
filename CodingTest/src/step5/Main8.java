package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 8번 문제
*/
public class Main8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String sentence = scanner.nextLine();
		int sum = 1;
		
		if(sentence.charAt(0) == ' ') {
			sum -= 1;
		}
		if(sentence.charAt(sentence.length()-1) == ' ') {
			sum -= 1;
		}
		
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				sum += 1;
			}
		}
		
		System.out.print(sum);
		
		/*
		String S = in.nextLine();
		in.close();
 
		// st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
		StringTokenizer st = new StringTokenizer(S," ");
		
		// countTokens() 는 토큰의 개수를 반환한다
		System.out.println(st.countTokens());	
		*/
		
		scanner.close();
	}
}