package org.example;

public class Loops {
    public static void main(String[] args) {
    /*    //todo=========while loop======================
        int num = 1;
        while(num<=10){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        //todo=============for loop=================================
       for(int i= 1;i<=10;i=i+1){
           System.out.print(i+" ");
       }*/
       //todo============== do while loop==========================
       /* int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i<=10);*/
        //todo=====================ForEach lopo==============
        int[] numArray = {1,17,3,4,5,6,7,8,9,10};
        int even = 0;
        int odd =0;
        for(int component : numArray ){
            if (component%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("number of even number is: "+even);
        System.out.println("number of odd number is: "+odd);
    }
}