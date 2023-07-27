package org.example;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the org.example.Temperature");
        int tem= sc.nextInt();
        if(tem>40){
            System.out.println("Weather is very hot.");
        }
        else if (tem<20){
            System.out.println("Weather is very cold.");
        }
        else {
            System.out.println("Weather is pleasant.");
        }
    }
}
