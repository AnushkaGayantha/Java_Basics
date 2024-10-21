package chapter2;

import java.util.Scanner;

public class QuotaCalculations {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        //Intialize values
        int quto = 10;

        System.out.println("Enter the number of sales you made this week ");
        int sales = scan.nextInt();
        scan.close();

        if (sales>=quto){
            System.out.println("Congratz you met your quta ");
        }
        else {
            int salaesshort =  quto - sales;
            System.out.println("You did not make your quota. You were " + salaesshort + " sales short");
        }

    }
}
