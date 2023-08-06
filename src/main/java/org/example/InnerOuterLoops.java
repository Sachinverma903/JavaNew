package org.example;

public class InnerOuterLoops {
    public static void main(String[] args) {
        int weeks=4;
        int days = 7;
        for(int i=1; i<=weeks;++i){
            System.out.println("Weeks:" +i );
            for(int j=1; j<=days;++j){
                System.out.println("Day :- "+j);
            }

        }
    }
}
