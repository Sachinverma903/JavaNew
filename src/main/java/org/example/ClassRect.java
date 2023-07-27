package org.example;

import java.util.Scanner;

public class ClassRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of rectangle");
        int len = sc.nextInt();
        System.out.println("width of rectangle");
        int wid = sc.nextInt();

        if(len == wid){
            System.out.println("Given rectangle is square.");
        }
        else {
            System.out.println("Given rectangle is not square.");
        }
    }
}
