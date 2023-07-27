package org.example;

import java.util.Scanner;

public class KmToM {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Please enter the value of kilometer");
        int km = Scan.nextInt();
        double miles = (km * 0.621);
        System.out.println("Convert into miles" + "  " + miles);
    }
}
