package org.example;

//DRY Do Not Repeat @Override;

public class Method2_Class2 extends Method1_Class1 {
    public int multi(int a, int b){

        return (a*b);
    }
    public static void main(String[] args) {
       Method1_Class1 obj = new Method1_Class1();
        Method2_Class2 obj1 = new Method2_Class2();

        int x = 15;
        int y = 10;
        int z = obj.add(x, y);
        int j = obj.sub(x, y);
        int k = obj1.multi(x, y);
        System.out.println("sum of the number : "+z);
        System.out.println("sub of the number : "+j);
        System.out.println("multiply of the number : "+k);
    }

}
