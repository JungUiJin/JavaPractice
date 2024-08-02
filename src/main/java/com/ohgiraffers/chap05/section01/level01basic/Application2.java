package com.ohgiraffers.chap05.section01.level01basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 길이가 5인 String 배열을 선언하고
         * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
         * 스캐너로 0부터 4까지의 정수를 입력 받아
         * 해당 정수의 인덱스에 있는 과일을 출력하세요
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */
        Scanner sc = new Scanner(System.in);
        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과"};
        System.out.println("0에서 4사이의 정수를 입력하시오. : ");

        int fIndex = sc.nextInt();

        if(fIndex >= 0 && fIndex < fruit.length) {
            System.out.println(fruit[fIndex]);
        }else {
            System.out.println("인덱스의 범위를 벗어났습니다.");
        }

    }
}
