package org.example;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount");

        int bill = sc.nextInt();
        if(bill>1000){
            int bill2 = bill-(bill/10);
            System.out.println("your billing amount is "+bill2);
        }
        else {
            System.out.println("your billing amount is "+bill);
        }
    }
}
