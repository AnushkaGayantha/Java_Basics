package chapter2;

import java.util.Scanner;

public class LoanQuliafy {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int requiredsallary = 30000;
        double requieredexperience = 2;

        System.out.println("How much money you earn ");
        int sallary = scan.nextInt();

        System.out.println("umber of years currently work ");
        int currentexperience = scan.nextInt();
        scan.close();

        if (requiredsallary >=  sallary) {
            if (currentexperience >= requieredexperience) {
                System.out.println("Congratz you qualfy for the loan ");
            }
            else {
                System.out.println("Sorry you must work on you current job " + requieredexperience + " Years ");
            }

        }
        else {
            System.out.println("Sorry you must earn at least $ " + requiredsallary + "to qualyfy for the loan");
        }

    }
}
