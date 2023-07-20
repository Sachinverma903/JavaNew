package org.example;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int userInput1 = sc.nextInt();
        System.out.println("the value you have entered is " + userInput1);
        System.out.println("Please enter value 1");
        int num1 = sc.nextInt();
        System.out.println("Please enter value 2");
        int num2 = sc.nextInt();
        System.out.println("the sum of the given values is "+ (num1+num2));
        System.out.println("please enter first name");
        String firstName = sc.nextLine();
        System.out.println("please enter last name");
        String lastName = sc.nextLine();
        System.out.println("your full name is " + firstName + " " + lastName);
        int num;



    }
}
