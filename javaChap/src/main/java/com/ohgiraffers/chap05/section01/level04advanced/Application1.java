package com.ohgiraffers.chap05.section01.level04advanced;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */
        int[] lotto = new int[6];
        int ranNum = (int)(Math.random() * 45)+1;
        System.out.println("난수 생성 : " +ranNum);
        lotto[0] = ranNum ;

        for(int i = 1; i < 6; i++){
            ranNum = (int)(Math.random() * 45)+1 ;
            System.out.println("난수 생성 : " +ranNum);
            for(int j = 0; j < i; j++){
                if(lotto[j] == ranNum){
                    System.out.println("looto[" + j + "]와 중복");
                    i--;
                    break;
                }else{
                    lotto[i] = ranNum;
                }
            }
        }
        Arrays.sort(lotto);
        for(int i = 0; i < 6; i++){
            System.out.print(lotto[i]+" ");
        }
    }
}
