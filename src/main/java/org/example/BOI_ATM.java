package org.example;
import java.util.Scanner;
public class BOI_ATM {
    public void getATM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BOI ATM");
        System.out.println("Please enter 4 digits pin");
        int pin = sc.nextInt();
            System.out.println("Press 1 for Balance Check");
            System.out.println("Press 2 for Withdrew");
            System.out.println("Press 3 for Change your atm pin ");
            System.out.println("Press 4 for Exit");
        int press = sc.nextInt();
            if(press==1){
                System.out.println("Your balance is 10,000");
            }
            else if (press==2){
                System.out.println("Please enter your amount");
                int amt = sc.nextInt();
                System.out.println("Amount have been debited from your account");
            }
            else if (press==3){
                System.out.println("Please enter your new pin");
                int npin = sc.nextInt();
                System.out.println("Your pin have been change successfully");
            }
            else if(press==4){
                System.out.println();
            }
            else{
                System.out.println("Please enter is valid input");
            }
           {
                System.out.println("Thank you for using BOI ATM");
            }
        }

    public static void main(String[] args) {
        BOI_ATM obj = new BOI_ATM();
        obj.getATM();
    }
}

