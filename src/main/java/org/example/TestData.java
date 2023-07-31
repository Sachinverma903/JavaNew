package org.example;
import java.util.Scanner;

public class TestData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Please the 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Please the 3rd number");
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
                System.out.println("greater number"+num1);
            }
        else if (num2>num1&&num2>num3){
            System.out.println("greater number"+num2);
        }
        else{
            System.out.println("greater number"+num3);
        }
    }
}
