package com.ohgiraffers.chap01.level01.basic;

public class Application2 {
    public static void main(String[] args) {
        /* 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */
        double weight = 12.5;
        double height = 36.4;
        System.out.print("면적 : ");
        System.out.println(weight * height);
        System.out.print("둘레 : ");
        System.out.println( (weight*2)+(height*2) );
    }
}
