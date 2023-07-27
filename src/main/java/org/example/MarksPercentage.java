package org.example;

import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Please enter sub1 marks");
       int sub1 = sc.nextInt();
        System.out.println("Please enter sub2 marks");
        int sub2= sc.nextInt();
        System.out.println("Please enter sub3 marks");
       int sub3 = sc.nextInt();
        System.out.println("Please enter sub4 marks");
        int sub4 = sc.nextInt();
        System.out.println("Please enter sub5 marks");
        int sub5 = sc.nextInt();
        //System.out.println("Total marks obtained");
        int obtainedMarks = (sub1+sub2+sub3+sub4+sub5);
        System.out.println("Total marks obtained" + "  " + obtainedMarks);
        float percentage = obtainedMarks * 100 /500;

        System.out.println("percentage =  " + percentage );


    }

}
