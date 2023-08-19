package org.example;
abstract class animal{
    abstract String sound();
    public String eyes(){
        return "It has two eyes";
    }
}
class dog extends animal {
    public String sound() {
        return "it barks";
    }
}
class cat extends animal{
        public String sound(){
            return "it meows";
        }
    }



public class AbstractClass {
    public static void main(String[] args) {
        dog dog1 = new dog();
        cat cat1 = new cat();
        String d = dog1.sound();
        String c = cat1.sound();
        System.out.println("dog: " +d);
        System.out.println("cat: " +c);
        System.out.println(dog1.eyes());
    }
}
