package com.ohgiraffers.chap03.level01.basic;

public class Application {
    public static void main(String[] args) {
        // 생성자 생성
        Calculator calculator = new Calculator();
        // 메소드 호출 확인
        calculator.checkMethod();
        // 1부터 10까지 합 리턴 메소드
        System.out.println("1부터 10까지의 합 : "+calculator.sum1to10());
        // 10,20 중 큰 값 출력 메소드
        calculator.checkMaxNumber(10,20);
        // 10, 20의 합 리턴 메소드
        System.out.println("10과 20의 합은 : "+calculator.sumTwoNumber(10,20));
        // 10, 5의 차 리턴 메소드
        System.out.println("10과 5의 차는 : "+calculator.minusTwoNumber(10,5));
    }
}
