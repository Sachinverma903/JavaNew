package org.example;

import java.sql.SQLOutput;

interface Phone {
    public void ring();
    public void call();
    public void message();
}
public class Smartphone implements Phone{
    String brand;
    String model;

    @Override
    public void ring() {
        System.out.println("ringtone");
    }

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void message() {
        System.out.println("Messaging");
    }

    public static void main(String[] args) {
        Smartphone Galaxy_Y = new Smartphone();
        Galaxy_Y.call();
        Galaxy_Y.ring();
     

    }
}
