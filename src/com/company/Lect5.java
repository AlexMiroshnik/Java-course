package com.company;

public class Lect5 {
    public static void main(String [] args) {
        int[] numbers = {-1,2,3,4,5,6,7,-8,-9,-10};
        int max = numbers[0];
        int imax = 0;
        int i = 0;
        while (i < numbers.length){
            if ( numbers[i] > max) {
                max = numbers[i];
                imax = i;
            }
            i++;
        }
        System.out.println("Biggest number=" + max);
    }
}
