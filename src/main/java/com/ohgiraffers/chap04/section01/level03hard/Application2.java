package com.ohgiraffers.chap04.section01.level03hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입력하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후
         * 프로그램 종료
         *
         * -- 상품 가격 --
         * 사과 :  1000원
         * 바나나 : 3000원
         * 복숭아 : 2000원
         * 키위 : 5000원
         *
         * -- 입력 예시 --
         * 과일 이름을 입력하세요 : 바나나
         *
         * -- 출력 예시 --
         * 바나나의 가격은 3000원 입니다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("찾으시는 과일을 입력하십시오. : ");
        String fruit = sc.nextLine();
        switch (fruit){
            case "사과":{
                System.out.println(fruit + "의 가격은 1000원 입니다.");
                break;
            }
            case "바나나":{
                System.out.println(fruit + "의 가격은 3000원 입니다.");
                break;
            }
            case "복숭아":{
                System.out.println(fruit + "의 가격은 2000원 입니다.");
                break;
            }
            case "키위":{
                System.out.println(fruit + "의 가격은 5000원 입니다.");
                break;
            }
            default:{
                System.out.println("준비된 상품이 없습니다.");
            }
        }
    }
}
