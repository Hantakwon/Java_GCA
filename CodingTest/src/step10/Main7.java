package step10;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 10단계 7번 문제
*/
public class Main7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
			boolean tri = true;
			if (num1 == 0 && num2 == 0 && num3 == 0)
				break;

			if (num1 >= num2 + num3) {
				System.out.println("Invalid");
				tri = false;
			} else if (num2 >= num1 + num3) {
				System.out.println("Invalid");
				tri = false;
			} else if (num3 >= num1 + num2) {
				System.out.println("Invalid");
				tri = false;
			}

			if (tri) {
				if (num1 == num2 && num1 == num3) {
					System.out.println("Equilateral");
				} else if (num1 == num2) {
					System.out.println("Isosceles");
				} else if (num1 == num3) {
					System.out.println("Isosceles");
				} else if (num2 == num3) {
					System.out.println("Isosceles");
				} else
					System.out.println("Scalene");
			}
		}
		scanner.close();
	}
}
