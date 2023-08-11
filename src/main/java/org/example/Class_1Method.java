package org.example;

import java.util.Scanner;

public class Class_1Method {
    //(+, -, *, /) write a methode to perform these actions on 2 numbers.

    public static int add(int a, int b) {
        int c = (a + b);
        return c;
    }
    public static int subtraction(int a, int b){
        int c = (a-b);
        return c;
    }
    public static int multiplication( int a, int b){
        int c = ( a*b);
        return c;
    }
    public static double divide(double a, double b){
        double c = (a/b);
        return c;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = add(x, y);
        int sub= subtraction(x, y);
        int multi = multiplication(x, y);
        double div = divide(x, y);

        System.out.println("Sum of the numbers :" + sum);
        System.out.println("Subtract of the numbers : " +sub);
        System.out.println("Multiplication of the numbers : " +multi);
        System.out.println("Division of the numbers : " + div);
    }

}
