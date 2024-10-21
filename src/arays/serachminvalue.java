package arays;

import java.util.Random;
import java.util.Scanner;

public class serachminvalue {
    public static void main(String[] args) {
        int arr[] =  new int[10];
        //Random Rand = new Random();

        int max = 0;
        int min = arr[0];


        for(int i = 0; i < 10; i++) {
           // int RandNum = Rand.nextInt(10);
          // arr[i] = RandNum;

            if (i == 0) System.out.print("[");

            System.out.print(arr[i] + " ");

            if (i == 9) System.out.println("]");


          //  if (RandNum>max) {
              ///  max = RandNum;
            }

    }
}
