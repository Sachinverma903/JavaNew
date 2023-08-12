package org.example;
public class Method_overloading {
    int sum(int a){
        return a;
    }
    int sum(int a, int b){
        return a+b;
    }
    int sum(int x, int y, int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        Method_overloading obj = new Method_overloading();
        int dummy = obj.sum(5, 25);
    }
}
