package com.ohgiraffers.chap08.level01basic;

import java.util.Arrays;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private static int index=0;

    public void addShape(Shape shape) {
        if(index>=shapes.length){
            shapes = Arrays.copyOf(shapes, shapes.length*2);
        }
        shapes[index] = shape;
        index++;
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for(int i = 0; i < index; i++) {
            if(shapes[i].equals(shape)) {
                for(int j=i; j < index-1; j++) {
                    shapes[j] = shapes[j+1];
                }
                shapes[index-1] = null;
                index--;
                break;
            }
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for(int i = 0; i<index; i++) {
            System.out.println((i+1)+". "+shapes[i].getClass().getSimpleName() + " " + shapes[i].calculateArea() + " " + shapes[i].calculatePerimeter());
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sum = 0;
        for(int i = 0; i<index; i++) {
            sum += shapes[i].calculateArea();
        }
        return sum;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sum = 0;
        for(int i = 0; i<index; i++) {
            sum += shapes[i].calculatePerimeter();
        }
        return sum;
    }
}
