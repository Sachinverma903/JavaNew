package org.example;

import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter the temperature in Fehreheint ");

        double fahrenheit = scan.nextInt();

        double celsius =  (fahrenheit - 32)*5/9;
        System.out.println("Please enter the temperature in celsius "+celsius + "°C");

    }
}
