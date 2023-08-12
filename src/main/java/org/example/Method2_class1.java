package org.example;
// DRY: don't repete yourself
public class Method2_class1 extends Method2_class2{
 public int multi(int a, int b){
     return a*b;
 }
 @Override
 public int add(int a, int b){
     int c =     2*(a*b);
     return c;
 }

    public static void main(String[] args) {
       Method2_class2 obj  = new Method2_class2();
        Method2_class1 obj1 = new Method2_class1();
        int x = 15;
        int y = 10;
        int z = obj1.add(x,y);
        int z1 = obj.add(x,y);
        System.out.println(z);
        System.out.println(z1);

    }
}
