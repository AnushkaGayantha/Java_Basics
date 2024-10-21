package chapter3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        boolean again = false;
        do {
            System.out.println("Enter 1st Number ");
            int numberOne = scan.nextInt();

            System.out.println("Enter 2nd Number ");
            int numberTwo = scan.nextInt();

            int Sum = numberOne+numberTwo;
            System.out.println("Your Sum is "+Sum);

            System.out.println("Would you like to start over ");
            again = scan.nextBoolean();
        }
        while (again);
        scan.close();

    }
}
