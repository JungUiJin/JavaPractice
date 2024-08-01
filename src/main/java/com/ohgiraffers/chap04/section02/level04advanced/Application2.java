package com.ohgiraffers.chap04.section02.level04advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("받으신 금액을 입력하세요: ");
        int money = sc.nextInt();
        System.out.println("상품가격을 입력하세요: ");
        int price = sc.nextInt();
        System.out.println("==============");
        int count = 0;

        int change = money - price;

        // 5만원 지폐 세기
        while(change>=50000){
            count ++;
            change -= 50000;
        }
        System.out.println("* 50000원권 지폐 "+count+"장");
        count = 0;
        // 만원 지폐 세기

        while(change>=10000){
            count ++;
            change -= 10000;
        }
        System.out.println("* 10000원권 지폐 "+count+"장");
        count = 0;

        // 오천원 지폐 세기
        while(change>=5000){
            count ++;
            change -= 5000;
        }
        System.out.println("* 5000원권 지폐 "+count+"장");
        count = 0;

        // 천원 지폐 세기
        while(change>=1000){
            count ++;
            change -= 1000;
        }
        System.out.println("* 1000원권 지폐 "+count+"장");
        count = 0;

        // 오백원 동전 세기
        while(change>=500){
            count ++;
            change -= 500;
        }
        System.out.println("* 500원 동전 "+count+"개");
        count = 0;

        // 백원 동전 세기
        while(change>=100){
            count ++;
            change -= 100;
        }
        System.out.println("* 100원 동전 "+count+"개");
        count = 0;

        // 오십원 동전 세기
        while(change>=50){
            count ++;
            change -= 50;
        }
        System.out.println("* 50원 동전 "+count+"개");
        count = 0;

        while(change>=10){
            count ++;
            change -= 10;
        }
        System.out.println("* 10원 동전 "+count+"개");
        count = 0;

        System.out.println("==========");
        System.out.println("거스름돈 : " +(money - price)+"원");
    }
}
