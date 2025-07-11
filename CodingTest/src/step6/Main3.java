package step6;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 6단계 3번 문제
*/
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.close(); 
		
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n"); 
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}
}