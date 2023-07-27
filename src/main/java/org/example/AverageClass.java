package org.example;

import java.util.Scanner;

public class AverageClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the first number");
            int a1 = sc.nextInt();

            System.out.println("Please enter the second number");
            int a2 = sc.nextInt();

            System.out.println("Please enter the third number");
            int a3 = sc.nextInt();

            System.out.println("Please enter the fourth number");
              int a4 = sc.nextInt();

        System.out.println("Please enter the fifth number");
        int a5 = sc.nextInt();

            double average = (double) (a1 + a2 + a3 + a4 + a5)/5;
            System.out.println("The Average of five number are" + "   " + average);

        }

    }

