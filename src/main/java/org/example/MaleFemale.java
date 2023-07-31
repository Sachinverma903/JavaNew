package org.example;

import java.util.Scanner;

public class MaleFemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter age");
        int age = sc.nextInt();
        System.out.println("Please enter sex M or F");
        String sex = sc.nextLine();
        if (sex.equals("f")) {
            if ((age >= 20) && (age <= 40)) {

                System.out.println("she will work only in urban areas");
            }
        }

        if (sex.equals("m")) {
            if ((age >= 20) && (age < 40)) {
                System.out.println("you can work anywhere");
            }
            if ((age >= 40) && (age <= 60)) {
                System.out.println("He will work in urban areas");
            }
        } else {
            System.out.println("Not allowed for work anywhere");
        }


    }
}




