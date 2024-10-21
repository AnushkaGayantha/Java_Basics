package chapter2;

import java.util.Scanner;

public class MarksCalcultions {

    public static void main(String[]args){

        Scanner scan = new Scanner (System.in);
        int  Extra = 5;

        System.out.println("Enter maths marks that get ");

        int Marks = scan.nextInt();
        scan.close();

        if (Marks > 75){
          Marks = Marks + Extra;
        }
        System.out.println("You scored " + Marks);
    }
}
