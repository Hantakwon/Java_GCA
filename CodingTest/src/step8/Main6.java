package step8;

import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 8단계 6번 문제
*/

/*	
  1 1/1
  
  2 1/2 y+1
  3 2/1 x+1
  
  4 3/1 x+2
  5 2/2 x+1 y+1
  6 1/3 y2
  
  7 1/4 y+3
  8 2/3 x+1 x+2
  9 3/2 x+2 y+1
  10 4/1 x+3
  
  11
  12
  13
  14
  15
  
  1  2  4  7  11 16
  1, 2, 3, 4, 5, 6
     y, x, y, x	
*/
public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int num2 = num;
		int x = 1, y =1;
		int i = 1;
		int sum = 0;
		
		while(true) {
			num -= i;
			sum += i;
			if(num <= 0) {
				break;
			}
			i++;
		}
		
		if(i % 2 == 0) {
			int count = i-1;
			int yValue = sum-num2;
			int xValue = count-yValue;
			
			x+= xValue;
			y+= yValue;
			
			System.out.println(x+"/"+y);
		} else {
			int count = i-1;
			int xValue = sum-num2;
			int yValue = count-xValue;
			
			x+= xValue;
			y+= yValue;
			
			System.out.println(x+"/"+y);
		}
		
		scanner.close();
	}
}
