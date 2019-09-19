package com.company;

public class NewTriangleTest {
    public static void main(String[] args) {
        NewTriangle Kingdom = new NewTriangle();
        System.out.println(Kingdom);
        Kingdom.getA();
        Kingdom.getB();
        Kingdom.setA(10.0f);
        Kingdom.getB();
        Kingdom.setB(10.0f);
        Kingdom.getC();
        Kingdom.setC(10.0f);
        Kingdom.calculatePerimeter();
    }
}
