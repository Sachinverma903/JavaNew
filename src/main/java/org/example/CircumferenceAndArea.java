package org.example;

import java.util.Scanner;

public class CircumferenceAndArea {

    public static void main(String[] args) {
        Scanner cir = new Scanner(System.in);
        System.out.println("Please enter the radius");
        int rad = cir.nextInt();

        double circumference = (2* Math.PI * rad);
        System.out.println("Circumference of the circle" +"  " + circumference);

        double area = (3.14*rad*rad);
        System.out.println("Area of the circle" +"  " + area);

    }
}
