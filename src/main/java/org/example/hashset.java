package org.example;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> no = new HashSet<>();
        no.add(24);
        no.add(24);
        no.add(25);
        no.add(35);
        no.add(45);
        no.remove(25);
       // no.clear();
        //no.size();
        //System.out.println(no.size());
        //System.out.println(no.getClass());
        System.out.println(no);


    }
}
