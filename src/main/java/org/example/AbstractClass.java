package org.example;

 abstract class animals{
     abstract String legs();
     abstract String fly();
}
 class horse extends animals{
     @Override
     public String legs() {
         return "Horse has four legs";
     }
     public String fly(){
         return "It can not fly";
     }
 }
 class peacock extends animals{
     public String legs(){
         return "Peacock has two legs";
     }
     public String fly(){
         return "It can fly";
     }
 }
 public class AbstractClass {
     public static void main(String[] args) {
         horse horse1 = new horse();
         peacock peacock1 = new peacock();
         String h = horse1.legs();
         String h1 = horse1.fly();
         String p = peacock1.legs();
         String p1 = peacock1.fly();
         System.out.println(h + " and " + h1);
         System.out.println(p + " and " + p1);
     }
}

