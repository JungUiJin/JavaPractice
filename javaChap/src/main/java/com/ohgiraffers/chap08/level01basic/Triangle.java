package com.ohgiraffers.chap08.level01basic;

public class Triangle extends Shape implements Resizable{

    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    public Triangle() {

    }
    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    double calculateArea() {
        return (double) (base * height) /2;
    }

    @Override
    double calculatePerimeter() {
        return base + side1 + side2 + side3;
    }

    @Override
    public void resize(double factor) {
        this.base *= factor;
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
        this.height *= factor;
    }
}
