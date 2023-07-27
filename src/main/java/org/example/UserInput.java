package org.example;

//import java.util.Scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value 1");
        float userInput1 = sc.nextInt();
       // System.out.println("the value you have entered is" + " "+ userInput1);
        System.out.println("Please enter value 2");
        float userInput2 = sc.nextInt();
        //System.out.println("the value you have entered is" + "   " +userInput2);
      System.out.println("the sum of the given values is" +"  "+ (userInput1+userInput2));
      System.out.println("the subtraction of the value is" + " "+ (userInput1-userInput2));
      System.out.println("the divide of the given value is" + " " + (userInput1/userInput2));
      System.out.println("the multiplication of the given value is"+ " "+ (userInput1 * userInput2));

    }
}
