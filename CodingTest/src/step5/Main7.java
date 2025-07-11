package step5;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 5단계 7번 문제
*/
public class Main7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < count; i++) {
			String line = scanner.nextLine();
			String[] parts = line.split(" ", 2);

			int num = Integer.parseInt(parts[0]);
			String s = parts[1]; 

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < num; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println(); 
		}
		
		scanner.close();
	}
}