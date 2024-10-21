package chapter4;

import java.util.Scanner;

public class SumClculationsithMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre Value 1");
        int i = scan.nextInt();
        System.out.println("Entre Value 2");
        int j = scan.nextInt();
        GetSum(i,j);

    }

    public static int GetSum(int i, int j) {
        int sum = (i + j);
        System.out.println("Your total value is "+sum);
        return sum;
    }

}
