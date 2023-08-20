package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {
    public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(50);
        list1.add(70);
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
        list1.clear();
        list1.add(15);
        list1.add(90);
        list1.add(70);
        list1.add(65);
        list1.set(0,20);
        //Collections.sort(list1);
        System.out.println(list1);
    }
}
