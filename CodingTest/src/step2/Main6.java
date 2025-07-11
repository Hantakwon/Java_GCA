package step2;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 2단계 6번 문제
*/
public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		
	    int totalMinutes = h * 60 + m;

	    totalMinutes += x;

	    int newHour = (totalMinutes / 60) % 24;
	   
	    int newMinute = totalMinutes % 60;

	    System.out.println(newHour + " " + newMinute);
	    
	    scanner.close();
	}
}