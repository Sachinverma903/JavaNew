package org.example;

import java.util.Scanner;

public class Class_2SquareCube {
    //todo write a program to return square and cube of a number.

    public static int square(int a){
        int sq = (a*a);
        return sq;
    }
    public static int cube(int a){
        int cu = (a*a*a);
        return cu;
    }
    public static int perimeter(int a){
        int peri =(a+a+a+a);
        return peri;
    }
    public static int area(int a){
        int squa = (a*a);
        return squa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int sq1 = square(num);
        int cu1 = cube(num);
        int sqperi1 = perimeter(num);
        int sqarea = area(num);
        System.out.println("Square of the number : " +sq1);
        System.out.println("Cube of the number : " + cu1);
        System.out.println("Perimeter of the square : " +sqperi1 );
        System.out.println("Area of the square : " +sqarea);
    }
}
