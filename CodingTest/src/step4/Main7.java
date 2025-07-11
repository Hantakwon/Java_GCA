package step4;

import java.util.Scanner;

/*
날짜 : 2025/07/10
이름 : 한탁원
내용 : 백준 4단계 7번 문제
*/
public class Main7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] student = new int[30];
		int[] x = new int[28];
		
		for(int i=0; i<student.length; i++) {
			student[i] = i+1;
		}
		
		for(int i=0; i<x.length; i++) {
			x[i] = scanner.nextInt();
		}
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<student.length; j++) {
				if(x[i] == student[j]) {
					student[j] = 0;
				}
			}
		}
		
		for(int i=0; i<student.length; i++) {
			if(student[i] != 0) {
				System.out.println(student[i]);
			}
		}
		
		scanner.close();
	}
}
