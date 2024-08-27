package com.ohgiraffers.chap08.level01basic;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(width + height);
    }

    @Override
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
    }
}
