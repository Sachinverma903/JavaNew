package org.example;

import java.util.Scanner;

public class ArrayIntg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int[] num = new int[10];
        System.out.println("Please enter no 1");
        num[0]= sc.nextInt();
        System.out.println("Please enter no 2");
        num[1]= sc.nextInt();
        System.out.println("Please enter no 3");
        num[2]= sc.nextInt();
        System.out.println("Please enter no 4");
        num[3]= sc.nextInt();
        System.out.println("Please enter no 5");
        num[4]= sc.nextInt();
        System.out.println("Please enter no 6");
        num[5]= sc.nextInt();
        System.out.println("Please enter no 7");
        num[6]= sc.nextInt();
        System.out.println("Please enter no 8");
        num[7]= sc.nextInt();
        System.out.println("Please enter no 9");
        num[8]= sc.nextInt();
        System.out.println("Please enter no 10");
        num[9]= sc.nextInt();

        */
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Please enter extra number");
        int user = sc.nextInt();
        for(int i=0; i<num.length; i++) {
            if (num[i] == user) {
                System.out.println("Yes it is present in Array");

            } else {
                System.out.println("it is not present in Array");
                break;
            }

        }

    }
}
