package com.ohgiraffers.chap05.section01.level02normal;

import java.util.Scanner;

public class Applicatoin2 {
    public static void main(String[] args) {
        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 (-포함)");

        String num = sc.nextLine();
        char[] numArr = num.toCharArray();

        for (int i = 0; i < numArr.length; i++) {
            if(i<8) {
                System.out.print(numArr[i]);
            }else{
                System.out.print('*');
            }
        }

    }
}
