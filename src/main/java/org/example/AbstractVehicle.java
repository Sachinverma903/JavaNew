package org.example;

abstract class vehicle{
    abstract String tyres();
    abstract String headlight();
}
class bike extends vehicle{
    public String tyres(){
        return "Bike has two tyres";
    }
    public String headlight(){
        return "it has one headlight";
    }
}
class car extends vehicle{
    public String tyres(){
        return "Car has four tyres";
    }
    public String headlight(){
        return "It has two headlight";
    }
}
class truck extends vehicle{
    public String tyres(){
        return "Truck has eight tyres";
    }
    public String headlight(){
        return "it has four headlight";
    }
}

public class AbstractVehicle {
    public static void main(String[] args) {
        bike bike1 = new bike();
        car car1 = new car();
        truck truck1 = new truck();
        String b = bike1.tyres();
        String b1 = bike1.headlight();
        String c = car1.tyres();
        String c1 = car1.headlight();
        String t = truck1.tyres();
        String t1 = truck1.headlight();
        System.out.println(b+ " and " +b1);
        System.out.println(c+ " and " +c1);
        System.out.println(t+ " and " +t1);
    }
}
