package org.example;

import java.util.Scanner;

public class HelloNameClass {
    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);

        System.out.println("Please enter of your name");
        String name = Scan.nextLine();
        System.out.println("Hello" + " " + name );
        System.out.println("Have A Good Day!");

    }
}
