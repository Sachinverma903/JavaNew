package org.example;

import java.util.Scanner;

public class ArrayFirst {
    public static void main(String[] args) {
       /* int[] age = new int[5];
        age[0] = 15;
        age[1] = 20;
        age[2] = 25;
        age[3] = 20;
        age[4] = 25;

        for (int i=age.length; i>0; i--){
            System.out.println(age[i]);
        }*/
        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        boolean flag = false; //red flag
        System.out.println("Please enter extra number");
        int user = sc.nextInt();
        for(int i=0; i<num.length; i++) {
            if (num[i] == user) {
               flag = true;   //green flag
            }
        }
        if(flag){
            System.out.println("it is present");
        }
        else {
            System.out.println("it is not present");
        }
    }
}
