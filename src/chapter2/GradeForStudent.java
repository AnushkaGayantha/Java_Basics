package chapter2;

import java.util.Scanner;

public class GradeForStudent {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Student score Marks ");
        int Marks = scan.nextInt();
        scan.close();

        if(Marks<35){
            System.out.println("You Scored E Grade ");
        } else if (Marks<=35) {
            System.out.println("You Scored C Grade");
        } else if (Marks<=50) {
            System.out.println("You Scored C+ Grade");
        } else if (Marks<=75) {
            System.out.println("You Scored B Grade");
        } else if (Marks<=100) {
            System.out.println("You Scored A Grade");
        }
        else {
            System.out.println("Please Do Exam Again ");
        }
    }
}
