package step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
날짜 : 2025/07/15
이름 : 한탁원
내용 : 백준 9단계 3번 문제
*/
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		while(true) {
			int sum = 0;
			List<Integer> arrayList = new ArrayList<>();
			int num = scanner.nextInt();
			
			if(num == -1) {
				break;
			}
			
			for(int i=1; i<num; i++) {
				if(num % i == 0) {
					arrayList.add(i);
					sum += i;
				}
			}
			if(sum == num) {
				System.out.print(num + " = ");
				for(int j=0; j<arrayList.size(); j++) {
					if(j==arrayList.size()-1) {
						System.out.print(arrayList.get(j));
					} else 	System.out.print(arrayList.get(j) + " + ");
				}
				System.out.println();
			} else System.out.println(num + " is NOT perfect.");
			
		}
		
		scanner.close();
	}
}
