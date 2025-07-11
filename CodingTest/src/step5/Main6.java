package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 6번 문제
*/
public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		int[] alpha = new int[26];
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = -1;
		}

       for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            int index = ch - 'a'; 

            if (alpha[index] == -1) {
                alpha[index] = i;
            }
        }

        
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}
		
		scanner.close();
		
	}
}