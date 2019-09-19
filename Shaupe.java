package com.company;

public class Shaupe {
    public double length;
    public double width;

    public Shaupe(){

    }

    public Shaupe(double length, double width){
        this.length = length;
        this.width = width;

    }

//    Getter

    public double getLength(){
        return this.length;
    }
//    Setter

    public void setLength(double length){
        this.length = length;
    }

    public void calculateArea(){
        System.out.println(length * width);
    }
}


