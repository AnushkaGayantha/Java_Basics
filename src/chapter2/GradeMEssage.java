package chapter2;

import java.util.Scanner;

public class GradeMEssage {
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Grade ");
      String Grade = scan.next();
        String Message;

      switch (Grade){
          case "A":
            Message = "Excelant Job";
            break;

          case "B":
              Message = "Greade Job";
              break;

          case "C":
              Message = "Good Job";
                break;

          case "D":
              Message = "Need to work hard";
              break;

          case "F":
              Message = "Sorry you are fail";
              break;

          default:
              Message = "Invalid Grade";
              break;
      }
        System.out.println(Message);
    }
}
