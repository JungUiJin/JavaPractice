package com.ohgiraffers.chap08.level01basic;

public class Circle extends Shape implements Resizable{

    private double radius;
    public Circle() {}
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }
}
