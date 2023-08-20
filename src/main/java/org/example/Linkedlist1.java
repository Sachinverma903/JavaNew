package org.example;

import java.util.LinkedList;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Sachin");
        name.add("amit");
        name.add(0,"verma");
        name.set(1, "jyoti");
        name.remove(2);
        System.out.println(name);
    }
}
