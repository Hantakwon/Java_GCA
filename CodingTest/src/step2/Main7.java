package step2;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 2단계 7번 문제
*/
public class Main7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if(x == y && x == z) {
			System.out.println(10000+x*1000);
		} else if (x == y && x != z) {
			System.out.println(1000+x*100);
		} else if (x == z && y != z) {
			System.out.println(1000+x*100);
		} else if (y == z && x != y) {
			System.out.println(1000+y*100);
		} else {
			int max = x;
			if(max < y) {
				max = y;
			}
			if (max < z) {
				max = z;
			}
			System.out.println(max*100);
		}
		
		scanner.close();
	}
}