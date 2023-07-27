package org.example;

import java.util.Scanner;

public class Sum3Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter the third number");
        int num3 = sc.nextInt();
        int num = (num1 + num2 + num3);
        System.out.println("The sum of three number is" + "   " + num);

    }
}
