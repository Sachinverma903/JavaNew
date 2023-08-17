package org.example;

import java.util.Scanner;

public class Method1_Class1 {
    public int add(int a, int b){
        return (a+b);
    }
    public int sub( int a, int b){
        return (a-b);
    }
   // public int multi(int a, int b){
        //return (a*b);
   // }
    public double divide(double a, double b){
        return (a/b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method1_Class1 obj = new Method1_Class1();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = obj.add(x , y);
        int j = obj.sub(x, y);
        //int k = obj.multi(x, y);
        double l = obj.divide(x, y);
        System.out.println("Sum of the number : " +z);
        System.out.println("Subtraction  of the number : " +j);
       // System.out.println("Multi of the number : " +k);
        System.out.println("divide of the number : " +l);
    }

}
