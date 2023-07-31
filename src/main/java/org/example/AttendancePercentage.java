package org.example;

import java.util.Scanner;

public class AttendancePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of class held");
        int numofclass = sc.nextInt();
        System.out.println("Please enter number of attendance");
        int numofatten = sc.nextInt();
        int numofper= (numofatten/numofclass)*100;
            if(numofper<=75){
                System.out.println("you are allow for exam.");
            }
        else{
            System.out.println("you are not allowed for exam.");
        }
    }
}
