package org.example;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       /* int age  = sc.nextInt();
        int age2  = sc.nextInt();
        if (age<18 || age2<18){
            System.out.println("get lost you can not go in");
        }
        else {
            System.out.println("Welcome to the roof top");
        }*/
       /* System.out.println("Please enter your age");
        int age2 = sc.nextInt();
        //age < 5 you are kid
        // age 5-17 you are a teenager
        //age >= 18 you are an adult

        if(age2<=5){
            System.out.println("you are a kid");
        }
        else if(age2>5&& age2<18){
            System.out.println("you are a teenager");
        }
        else if(age2>=18){
            System.out.println("you are an adult");
        }*/
   // =======================================================================
   // Nested if else condition
        int age3 = 17;
        String nat = "indian";
        if(nat=="indian"){
            if (age3>=18){
                System.out.println("you can vote");
            }
            else {
                System.out.println("you can not vote");
            }
        }
        else {
            System.out.println("you can not vote");
        }


    }
}
