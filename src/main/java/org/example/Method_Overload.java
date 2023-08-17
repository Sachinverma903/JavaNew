package org.example;

public class Method_Overload {
    int sum(int a){
        return a;
    }
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Method_Overload obj= new Method_Overload();
        int x = obj.sum(5);
        int y = obj.sum(10, 10);
        int z = obj.sum(10, 15, 20);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
