package org.example;

public class ArrayInt {
    public static void main(String[] args) {
        int[] age= new int[5];
        age[0]=20;
        age[1]=25;
        age[2]=30;
        age[3]=35;
        age[4]=40;
        for(int i = 0; i<age.length; i++){
            System.out.println(age[i]);
            //System.out.println("Age of student: " + (i+1) + "-" + age[i]);
        }
        }
}
