package org.example;
class parent{
    public void method1(){
        System.out.println("parent");
    }
}
class child extends parent{
    @Override
    public void method1(){
        System.out.println("method 1 in child class");
    }
    public void method2(){
        System.out.println("child");
    }
    public void method2(int a){
        System.out.println(a);
    }
    public void method2(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        child ch = new child();
        parent pr  = new parent();
        ch.method2();
        ch.method2(999);
        ch.method2("Sachin");

    }
}
public class Inheritence {

}
