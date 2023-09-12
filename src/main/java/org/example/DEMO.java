package org.example;

import java.util.Scanner;

public class DEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Alphabet-");
       String alpha = sc.nextLine();
        if(alpha.length()==1) {
            if (alpha.equals("a")) {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="e") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="i") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="o") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="u") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="A") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="E") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="I") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="O") {
                System.out.println("Given alphabet is vowel");

            }
            else if (alpha=="U") {
                System.out.println("Given alphabet is vowel");

            }
            else {
                System.out.println("Given alphabet is Consosant");

            }

        }
        else {
            System.out.println("Please enter one character");

        }
    }
    }


