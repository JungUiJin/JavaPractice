package com.ohgiraffers.chap01.level01.normal;

public class Application2 {
    public static void main(String[] args) {
        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */
        double language_score = 80.5;
        double math_score = 50.6;
        double  english_score = 70.8;
        System.out.println("총점 : " +(int)(language_score + math_score+english_score));
        System.out.println("평균 : " +(int)(language_score + math_score+english_score)/3);
    }
}