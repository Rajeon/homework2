package com.company;

public class Main {
    public static void main(String[] args) {
        printtenToOne(10);
   }

    public static void printtenToOne(int sub){
        for (int x = sub; x > 0; x--) {
            System.out.println(Math.pow(x,2));
        }
    }
}
