package org.example;

import java.util.Scanner;

abstract class shapes{
    abstract double area(double a);
    abstract double parameter(double a);
}
class square extends shapes{
    double area (double a){
        return a*a;

    }
    double parameter(double a){
        return (4*a);
    }
}
    class circle extends shapes{
    double area (double a){
        return (3.14*a*a);

    }
    double parameter (double a){
        return (2*3.14*a);
    }

}

public class AbstractShapes {
    public static void main(String[] args) {
        System.out.println("Please enter the value");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        square su = new square();
        circle cir = new circle();
        /*double a1 = su.area(num);
        double p1 = su.parameter(num);
        double ca = cir.area(num);
        double cp = cir.parameter(num);
         */


        System.out.println("Area of the square : "+su.area(num));
        System.out.println("Parameter of the square : "+su.parameter(num));
        System.out.println("Area of the circle : " +cir.area(num));
        System.out.println("Circumference of the circle : " +cir.parameter(num));

    }
}
