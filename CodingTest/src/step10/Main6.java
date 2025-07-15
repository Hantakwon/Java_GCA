package step10;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 10단계 6번 문제
*/
public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		if(num1+num2+num3 == 180) {
			if(num1 == num2 && num1 == num3) {
				System.out.print("Equilateral");
			} else if(num1 == num2) {
				System.out.print("Isosceles");
			} else if(num1 == num3) {
				System.out.print("Isosceles");
			} else if(num2 == num3) {
				System.out.print("Isosceles");
			} else System.out.print("Scalene");
		} else System.out.print("Error");
		scanner.close();
	}
}
