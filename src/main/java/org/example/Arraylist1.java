package org.example;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(0,50);
        list1.add(1, 70);
        list1.add(65);
        list1.remove(3);
        System.out.println(list1.size());
        System.out.println(list1.get(0));
        for (int component:list1) {
            System.out.println(component);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
