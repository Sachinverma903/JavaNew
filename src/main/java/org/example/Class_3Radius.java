package org.example;

import java.util.Scanner;

public class Class_3Radius {
    //todo take the radius and calculate the perimeter and area.

    public static double circumference(double a){
        double circum =(2*3.14*a);
        return circum;
    }
    public static double area(double a){
        double area = (3.14*a*a);
            return area;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double circum1 = circumference(r);
        double area1 = area(r);
        System.out.println("Circumference of circle : " +circum1);
        System.out.println("Area of circle : " +area1);


    }

}
