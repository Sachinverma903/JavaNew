package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Jyoti");
        name.add("Amit");
        name.add("Professor");
        name.add("Kridha");
        name.add("Sridha");
        name.add("Vrinda");
        name.add("Trisha");
        name.add(0, "Verma");
        //name.set(1, "Ashu");
       // System.out.println(name.get(1));
       // System.out.println(name.size());
      //  name.clear();
        //name.remove(3);
       // Collections.sort(name);
        /*for(String component : name){
            System.out.println(component);
        }
         */
        for(int i = 0; i< name.size(); i++){
            System.out.println(i);
        }
        System.out.println(name);
    }
}
