package chapter1;

import java.util.Scanner;

public class SeasonOfTheYear {

     public static void main(String[]args){

         Scanner scan = new Scanner (System.in);
         System.out.println("Enter session of the year");
         String seasson = scan.next();


         System.out.println("Whole number");
         int wholenumber = scan.nextInt();


         System.out.println("Adjective");
         String adjective = scan.next();
         scan.close();

         System.out.println("On a " + adjective+ seasson + " day, I drink a minimum of "+ wholenumber + " cup of coffee ");
    }

}


/*System.out.println("Enter a season of the year:");
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();*/