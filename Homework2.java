package com.company;

public class Homework2 {
    public static void main(String[] args) {
        int[] gross = {10,20,30,40};
        sheriff(gross);
    }


    public static void sheriff(int[] gross){
        for (int boom = 0; boom < gross.length; boom++)
            System.out.println(gross[boom]);
    }


}
