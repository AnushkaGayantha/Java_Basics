package chapter4;

import java.util.Scanner;

public class PoneBillCalculations {

    //Need To Check
    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        //double basecost = scan.nextDouble();

        System.out.println("Enter base cost of the plan: ");
        calculateTax();

        System.out.println("Enter overage minutes: ");
        overChargeFee();


        System.out.println("Phone Bill Statement is ");
        finalTotal();
    }
    //Tax
    public static void calculateTax() {
        Scanner scan = new Scanner(System.in);
        double TaxCalculation = scan.nextDouble();
        double Tax = 0.15;
        double plan = 0;
        double overchargeammont = 0;
        double SubTotal;

        TaxCalculation = (plan + overchargeammont) * Tax;
        System.out.println("Yor Tax is " + TaxCalculation);

    }
    //Overage
    public static void overChargeFee() {
        double Overage = 2.25;
        System.out.println("Over Charge is " + Overage);


    }

    //Total
    public static void finalTotal() {
        Scanner scan = new Scanner(System.in);
        double finalAmount = scan.nextDouble();
        double Tax = 0.15;
        double plan = 0;
        double overchargeammont = 0.25;
        finalAmount = (Tax+plan+overchargeammont);
        System.out.println("My final amount is "+finalAmount);
    }
}

