package org.example;

import java.util.Scanner;

public class MarksStu {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Marks");
            int marks= sc.nextInt();
            if(marks>=33){
                System.out.println("You are pass  ");
            }
            else {
                System.out.println("You are fail  ");
            }
        }

}
