package com.company;

public class Square {
    public double length;
    public double width;

    public Square(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void calculateArea(){
        System.out.println(length * width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
