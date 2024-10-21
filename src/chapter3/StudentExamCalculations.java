package chapter3;

import java.util.Scanner;

public class StudentExamCalculations {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int NumberOfStudents = 40;
        int NumberOfModules = 9;


       // System.out.println("Enter Student Marks ");
        double Total = 0;
        for (int i=0; i<NumberOfModules; i++)
        {

            for (int j=0; j<NumberOfModules; j++){
                System.out.println("Enter Module count "+(j+1));
                double Score = scan.nextDouble();
                Total = Score+Total;


            }
            double avg = Total/NumberOfModules;
            System.out.println("Th Test Avg of student" + (i+1) + " is " +avg);
        }
        scan.close();

    }



}
