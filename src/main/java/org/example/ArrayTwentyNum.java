package org.example;

public class ArrayTwentyNum {
    public static void main(String[] args) {
        int[] num = {-10,-5,-8,12,14,16,15,18,20,21,22,25,27,-28,-29,30,31,35,37,40};
        int pnum =0;
        int Nnum =0;
        int Enum =0;
        int Onum =0;
        for(int i = 0; i<num.length; i++){
            if(num[i]>=0){
                pnum++;
            }
            else{
                Nnum++;
            }
            if(num[i]%2==0){
                Enum++;
            }
            else{
                Onum++;
            }
        }
        System.out.println("No. of Positive value " + pnum);
        System.out.println("No. of Negative value " + Nnum);
        System.out.println("No. of Even value " + Enum);
        System.out.println("No. of Odd value " + Onum);

    }
}
