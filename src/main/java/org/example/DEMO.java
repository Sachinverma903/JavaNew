package org.example;

public class DEMO {
    public static void main(String[] args) {
        String name = "abcdefg";
        String nameU = "";
       char[] name2 =  name.toCharArray();//
        for (int i = name2.length-1; i>=0;i--){
            nameU = nameU+name2[i];
        }
        System.out.println(nameU);
    }
}
