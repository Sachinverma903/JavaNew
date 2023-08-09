package org.example;

import java.util.Scanner;

public class ArrayTenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num= {5,6,7,8,9,10,11,12,13,14};
        int[] num2 = new int[10];
        int con = 0;
       // for(int i =0; i< num.length; i++){
        for(int i =num.length-1; i>=0; i--){
            num2[con]=num[i];
            con++;
        }
        for(int i = 0; i<num2.length; i++) {
            System.out.println(num2[i]);
        }

    }
}
