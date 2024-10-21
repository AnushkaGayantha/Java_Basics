package chapter2;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales did employee make this week? ");
        int sales = scan.nextInt();
        scan.close();

        if(sales > 10)
        {
            salary = salary + bonus;
        }
        System.out.println("The Employee's pay is $" + salary);

    }
}
