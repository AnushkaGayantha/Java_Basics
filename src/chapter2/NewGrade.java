package chapter2;

import java.util.Scanner;

public class NewGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Student score Marks ");
        double score = scan.nextDouble();
        char grade = 0;

        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'B';
        } else if (score < 90) {
            grade = 'A';
        }
        System.out.println ("Your Grade Is " + grade);
    }

}
