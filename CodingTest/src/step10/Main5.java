package step10;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 10단계 5번 문제
*/
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int maxX = -10000, minX = 10000;
		int maxY = -10000, minY = 10000;
		
		if (num == 0) {
            System.out.println(0);
            return;
        }
		
		for(int i=0; i<num; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if(maxX < x) maxX = x;
			if(minX > x) minX = x;
			
			if(maxY < y) maxY = y;
			if(minY > y) minY = y;
		}

		System.out.println((maxX-minX) * (maxY-minY));
		
		scanner.close();
	}
}
