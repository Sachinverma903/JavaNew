package org.example;

import java.util.Scanner;

public class Library_BooksList {
    public void getBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the your name");
        String name = sc.next();
        System.out.println("Press 1 for art stream" + " " + "Press 2 for science stream" + " " + "Press 3 for commerce stream");
        int press = sc.nextInt();
        if(press==1){
            System.out.println("You chosen Art Stream");
            System.out.println("Enter the book name ");
            String as = sc.next();
        }
       else if(press==2){
            System.out.println("You chosen Science Stream");
            System.out.println("Enter the book name ");
            String ss = sc.next();
        }
        else if(press==3){
            System.out.println("You chosen Commerce Stream");
            System.out.println("Enter the book name ");
            String ss = sc.next();
        }
        else {
            System.out.println("Please enter valid input");
        }
        {
            System.out.println("Your book is credited in your digital library list");
            System.out.println("Thank you for using digital library");
        }

    }
    public static void main(String[] args) {
        Library_BooksList obj = new Library_BooksList();
        obj.getBook();
    }
}
