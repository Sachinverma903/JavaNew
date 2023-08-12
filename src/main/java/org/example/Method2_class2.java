package org.example;

import java.util.Scanner;

public class Method2_class2 {
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method2_class2 obj = new Method2_class2();
        int x = sc.nextInt();
        int y = sc.nextInt();
       int z = obj.add(x,y);
       int s = obj.sub(x,y);
        System.out.println(z);
        System.out.println(s);

    }
}
