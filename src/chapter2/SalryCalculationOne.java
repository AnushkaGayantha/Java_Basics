package chapter2;

import java.util.Scanner;

public class SalryCalculationOne {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int overtime  = 1000;
        int Bascosalary = 50000;
        double Fullpayment;

        System.out.println("Enter the working hours that employee works ");
        int worktime = scan.nextInt();
        scan.close();

        if (worktime>=8){
            Fullpayment = Bascosalary + overtime;
            System.out.println("You are eligible for overtime payment of and your Full Payment is $" +Fullpayment );

            }

        else {
            System.out.println("You are not eligible for overtime payment and yur payment is $" + Bascosalary);
        }

    }
}
