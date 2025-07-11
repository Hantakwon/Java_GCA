package step7;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 7단계 3번 문제
*/
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] sArray = new String[5];

		for (int i = 0; i < 5; i++) {
			String s = scanner.nextLine();
			sArray[i] = s;
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < sArray.length; j++) {
				try {
					System.out.print(sArray[j].charAt(i));
				} catch (StringIndexOutOfBoundsException e) {
					continue;
				}
			}
		}

		scanner.close();
	}
}
