package com.company;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle good = new Triangle(5.0f,5.0f,15.0f);
        System.out.println(good);
        good.calculatePerimeter();
    }
}
