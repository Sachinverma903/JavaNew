package org.example;

import java.util.Scanner;

public class VowelsConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input alphabets  ");
        String alpha= sc.nextLine();
        if(alpha.length()==1){
            if (alpha.equals("a") ||alpha.equals("e")||alpha.equals("i")||alpha.equals("o")||alpha.equals("u")){

                System.out.println("Given alphabet is vowel");
            }
            else if (alpha.equals("A") ||alpha.equals("E")||alpha.equals("I")||alpha.equals("O")||alpha.equals("U")){
                
                System.out.println("Given alphabet is vowel");
            }

            else {
                System.out.println("Given alphabet is consonants");
            }


        }
        else {
            System.out.println("Please enter one character");
        }

    }
}
