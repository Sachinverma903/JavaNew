package org.example;

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the side");
        int side = sc.nextInt();
        int asq = (side*side);
        System.out.println("Area of square" +"  " + asq + "  " + "  Meter");

        int ps = (4*side);
        System.out.println("Perimetre of square" +"  " + ps + " Square meter");


    }
}
