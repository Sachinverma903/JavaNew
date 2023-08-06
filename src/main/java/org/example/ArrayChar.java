package org.example;

public class ArrayChar {
    public static void main(String[] args) {
        char[] vowel = new char[5];
        vowel[0] = 'a';
        vowel[1] = 'e';
        vowel[2] = 'i';
        vowel[3] = 'o';
        vowel[4] = 'u';
        for(int i=0; i<vowel.length; i++){
            System.out.println(vowel[i]);
        }


    }
}
