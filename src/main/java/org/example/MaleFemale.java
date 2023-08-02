package org.example;

import java.util.Scanner;

public class MaleFemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sex M or F");
        String sex = sc.nextLine();
        System.out.println("Please enter age");
        int age = sc.nextInt();
        if (sex.equals("f")) {
            if ((age >= 20) && (age <= 40)) {

                System.out.println("she will work only in urban areas");
            }
            else{
                System.out.println("Not allowed for work anywhere");

            }
        }

       else if (sex.equals("m")) {
            if ((age >= 20) && (age < 40)) {
                System.out.println("you can work anywhere");
            }
            else if ((age >= 40) && (age <= 60)) {
                System.out.println("He will work in urban areas");
            }
            else {
                System.out.println("Not allowed for work anywhere");
            }
        }
       else{
            System.out.println("Please enter valid sex");
        }


    }
}




