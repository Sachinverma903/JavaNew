package org.example;

import java.util.Scanner;

public class DistanceClass {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the speed");
            int speed= sc.nextInt();
            float time = (200/speed);
            System.out.println("The time consumed is" +"  " + time + "  hours");


        }
    }


