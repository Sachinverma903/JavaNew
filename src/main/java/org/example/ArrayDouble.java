package org.example;

public class ArrayDouble {
    public static void main(String[] args) {
        double[] weight = new double[5];
        weight[0]=10.5;
        weight[1]=20.6;
        weight[2]=30.7;
        weight[3]=40.8;
        weight[4]=50.9;
        for(int i = 0; i<weight.length; i++){
            System.out.println("Weight of students : " + (i+1) + "-" +weight[i]);
        }
    }
}
