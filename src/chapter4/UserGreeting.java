package chapter4;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class UserGreeting {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Eter Your Name ");
        String Name = scan.nextLine();
        Greeting(Name);
    }

    public static String Greeting(String name){
        System.out.println("Hi Man ");
        return name;
    }
}
