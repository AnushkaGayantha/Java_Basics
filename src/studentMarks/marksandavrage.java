package studentMarks;

import java.util.Scanner;

public class marksandavrage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;


        int num2;
        double avg;

        System.out.println("Enter Number 1 ");
        num1 = scan.nextInt();

        System.out.println("Enter Number 2 ");
        num2 = scan.nextInt();

        avg = (num1+num2)/2;
        System.out.println("Enter Marks " +avg);

        scan.close();
    }
}
