package chapter4;

import java.util.Scanner;

public class GreetingUserName {

    public static void main(String[]args){

        System.out.println("Enter your Name ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        userGreeting(name);
    }

    public static void userGreeting(String username){
        System.out.println("Hi Dear "+username);
    }
}
