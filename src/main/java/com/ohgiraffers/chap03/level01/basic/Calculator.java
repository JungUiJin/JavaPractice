package com.ohgiraffers.chap03.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int sum10 = 0;
        for(int i = 1; i <= 10; i++){
            sum10 = sum10 + i;
        }
        return sum10;
    }
    public void checkMaxNumber(int a, int b){
        int maxNum = Math.max(a, b);
        System.out.println("두 수 중 큰 수는 "+maxNum+"이다.");
    }
    public int sumTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public int minusTwoNumber(int a, int b){
        int min = a - b;
        return min;
    }
}
