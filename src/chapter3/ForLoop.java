package chapter3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[]args) {
        System.out.println("Enter Item Ammount " );
        Scanner scan = new Scanner(System.in);
        int Quantity = scan.nextInt();
        double Total = 0;

       for (int i=1;  i<Quantity; i++)
       {
           System.out.println("Enter Cost if the item " );
           double Price = scan.nextDouble();
           Total = Total+Price;
       }
       scan.close();
       System.out.println("Total is " +Total);
    }
}
