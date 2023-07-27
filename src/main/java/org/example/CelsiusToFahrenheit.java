package org.example;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

            System.out.println("Please enter the temperature in Celsius ");

            double celsius = scan.nextInt();

            double fahrenheit =  (celsius*9/5)+32;
            System.out.println("Please enter the temperature in fahrenheit "+fahrenheit + "°f");


    }
}
