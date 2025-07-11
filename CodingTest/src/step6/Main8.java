package step6;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 한탁원
내용 : 백준 6단계 8번 문제
*/
public class Main8 {

    public static double getScore(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            default:   return 0.0;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalCredits = 0.0; 
        double totalWeightedSum = 0.0; 

        for (int i = 0; i < 20; i++) {
            // String subject = scanner.next();    
            double credit = scanner.nextDouble(); 
            String grade = scanner.next();     
            scanner.nextLine();               

            if (!grade.equals("P")) {
                totalCredits += credit;
                totalWeightedSum += credit * getScore(grade);
            }
        }

        scanner.close(); 

       
        if (totalCredits == 0.0) { 
            System.out.printf("%.6f%n", 0.0);
        } else {
            double average = totalWeightedSum / totalCredits;
            System.out.printf("%.6f%n", average); 
        }
    }
}
