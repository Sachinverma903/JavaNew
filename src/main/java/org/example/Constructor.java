package org.example;
class student{
    //properties, methods, constructor
    String name;
    int rollNo;
    student(){ //non parameterized
    }

    student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    String getAdmitCard(){
        return "admit card downloaded";
    }
}

public class Constructor {
    public static void main(String[] args) {
        student stu1 = new student("amit", 01);
        System.out.println(stu1.name);
        student stu2 = new student("sachin", 02);


    }
}
