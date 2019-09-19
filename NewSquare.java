package com.company;

public class NewSquare {
    private double length;
    private double width;

    public NewSquare(){

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void NewSquare(double length, double width){
        this.length = length;
        this.width = width;
    }



    public void calculateArea(){
        System.out.println(length * width);

    }

    @Override
    public String toString() {
        return "NewSquare{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
