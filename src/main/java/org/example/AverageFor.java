package org.example;

public class AverageFor {
    public static void main(String[] args) {
       /* int i = 1;
        int sum=0;
        while(i <=10){
            sum=sum+i;
            //System.out.println(sum);
            i++;
        }
        double avg= (double)sum/10;
        System.out.println(avg);

        */
        int sum=0;
        for(int i=1; i<=10;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        double avg= (double)sum/10;
        System.out.println(avg);

    }
}
