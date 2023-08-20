package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0,10);
        list1.add(1, 15);
        list1.add(2, 20);
        list1.add(3, 25);
        list1.add(4,30);
       /* for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        /*for(int component : list1){
            System.out.println(component);
        }
        //Collections.sort();
        //list1.set(0, 35);
        //list1.remove(2);
       // list1.get(2);
       // list1.clear();
        //System.out.println(list1.get(2));
        //System.out.println(list1.size());
         */
        System.out.println(list1);
    }
}
