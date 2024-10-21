package chapter3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int Rate = 15;
        int MaxHours = 40;

        System.out.println("How many Hours did you wor this week? ");
        double HousersWork = scan.nextDouble();

        while (HousersWork>MaxHours){
            System.out.println("Invalid Entry, yours hours in between 1 and 40. Please try again ");
            double House = scan.nextDouble();
        }
        scan.close();
        double gross = Rate*HousersWork;
        System.out.println("Gross Pay is $ "+gross);
    }
}
