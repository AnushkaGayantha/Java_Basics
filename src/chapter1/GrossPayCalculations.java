package chapter1;

import java.util.Scanner;

public class GrossPayCalculations {

    public static void main(String arg[])
    {
        System.out.println("Enter the number of hours the employee works");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        System.out.println("Enter the employee pay rate");
        //data declareation
        double rate = scan.nextDouble();
        scan.close();

        System.out.println("Your Payment is");
        double grosspay = hours*rate;

        System.out.println("The employee gross pay is " + grosspay);
    }
}
