package org.example;

public class ArrayString {
    public static void main(String[] args) {
        String[] name=new String[5];
        name [0] = "kridha";
        name [1] = "Sridha";
        name [2] = "Vrinda";
        name [3] = "Trisha";
        name [4] = "Vishava";
        for(int i=0; i<name.length; i++){
            System.out.println("Name of students : " +(i+1) + "-" + name[i]);
        }
    }
}
