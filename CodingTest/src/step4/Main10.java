package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 10번 문제
*/
public class Main10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		double[] score = new double[count];
		double max = 0;
		double sum = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = scanner.nextInt();
			if(score[i] > max) max = score[i];
		}
		
		for(int i=0; i<score.length; i++) {
			score[i] = score[i]/max*100;
			sum += score[i];
		}
		
		System.out.print(sum/count);
		
		scanner.close();
	}
}
