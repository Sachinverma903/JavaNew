package org.example;

import java.util.Scanner;

    public class javaprogram {
        //instance or global variable
        int a, b, c; //at the class level
        Scanner sc = new Scanner(System.in);
        public void addition() {
            System.out.println("Please enter the first number : ");
            a= sc.nextInt();
            System.out.println("Please enter the second number : ");
            b = sc.nextInt();
            c= a+b;
            System.out.println("Sum of  numbers are : " +c);
        }
        public void subtract() {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a-b;
            System.out.println("Substraction of  numbers are : " +c);


        }
        public void multiply() {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a*b;
            System.out.println("Multiplication of  numbers are : " +c);


        }
        public void divide() {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("Division of  numbers are : " +c);


        }
        public static void main(String[] args) {
            javaprogram obj = new javaprogram();
            obj.addition();
            obj.subtract();
            obj.multiply();
            obj.divide();

        }

    }


