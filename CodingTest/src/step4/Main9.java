package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 9번 문제
*/
public class Main9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int basketCount = scanner.nextInt();
		int[] basket = new int[basketCount];
		int count = scanner.nextInt();
		
		for(int i=0; i<basket.length; i++) {
			basket[i] = i+1;
		}
		
		for(int i=0; i<count; i++) {
			int x = scanner.nextInt() - 1;
			int y = scanner.nextInt() - 1;
			while(x<y) { 
				int temp = basket[x]; 
				basket[x] = basket[y]; 
				basket[y] = temp; 
				x++;	
				y--;	
			};
		}
		
		for(int i=0; i<basket.length; i++) {
			System.out.print(basket[i] + " ");
		}
		
		scanner.close();
	}
}
