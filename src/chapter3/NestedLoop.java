package chapter3;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int numberofStudents = 24;
        int numberofTest = 4;
        int i = 0;

        for (i=0; i<numberofStudents; i++);
        {

            double Total = 0;
            for (int j=0; j<numberofTest; j++)
            {
                System.out.println("Enter You Test Score " + (j+1));
                double Score = scan.nextDouble();
                Total = Score+Total;
            }
            double avg = Total/numberofTest;
            System.out.println("Th Test Avg of student" + (i+1) + " is " +avg);

        }
        scan.close();
    }
}
