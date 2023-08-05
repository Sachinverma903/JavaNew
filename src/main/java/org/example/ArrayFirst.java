package org.example;

import java.util.Scanner;

public class ArrayFirst {
    public static void main(String[] args) {
        int[] age = new int[5];
        age[0] = 15;
        age[1] = 20;
        age[2] = 25;
        age[3] = 20;
        age[4] = 25;

        for (int i=0; i<age.length; i++){
            System.out.println(age[i]);
        }
    }
}
