package automation;

import java.util.Scanner;

public class New_Chater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number A ");
        int a = scan.nextInt();

        System.out.println("Enter Number B ");
        int b = scan.nextInt();

        int sum = a+b;
        System.out.println("Total is "+sum);
    }
}
