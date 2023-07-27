package org.example;

import java.util.Scanner;

public class RectangleClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Length of rectangle");

        int length = scan.nextInt();

        System.out.println("Please enter the width of rectangle");

        int width = scan.nextInt();

        int perimeterOfrectangle = (2) * (length + width);

        System.out.println("Perimeter of the rectangle" + "  " + perimeterOfrectangle);

        int rA = (length*width);
        System.out.println("Area of the rectangle" +"  " + rA);


    }

}
