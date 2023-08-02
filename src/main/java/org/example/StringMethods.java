package org.example;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    /*String name = sc.nextLine();
   int length = name.length();
        System.out.println("the length of the name is "+length);
    char latter = name.charAt(0); // index should be start from 0
        System.out.println("the char at index 0 is "+latter);*/
        String email = "verma@reddifmail.com";
        System.out.println("please enter name");
        String name = "sachin";
        String name2 = sc.nextLine();
        int hashcode1 =  name.hashCode();
        System.out.println(hashcode1);
        int hashcode2 = name2.hashCode();
        System.out.println(hashcode2);
        if (name.equals("sachin")){
            System.out.println("true");
        }
        else {
            System.out.println("not true");
        }
       /* if(email.contains("gmail")){
            System.out.println("Storing in database");
        }
        else {
            System.out.println("it is not gmail");

        }*/


}
}