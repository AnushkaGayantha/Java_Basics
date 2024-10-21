package chapter3;

import java.util.Scanner;

public class NestedLoopTwo {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        int NumberOfStudents = 30;
        int NumberOfSubject = 5;

        for (int i=0; i<NumberOfStudents; i++)
        {

            double Total = 0;
            for (int j=0; j<NumberOfSubject; j++)
            {

                System.out.println("Subject 1 Score " +j+1);
                double Score = scan.nextDouble();
                Total = Score+Total;

            }

            double Avg = scan.nextDouble();
            Avg = NumberOfSubject/NumberOfStudents;
            System.out.println("Avg score that get by student " +(i+1)+"is"+Avg);
        }
        scan.close();
    }
}
