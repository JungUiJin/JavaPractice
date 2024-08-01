package com.ohgiraffers.chap04.section02.level01basic;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하십시오. : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) continue;
            sum += i;
        }

        System.out.println("1부터 "+n+"까지 짝수의 합 : "+sum);
    }
}
