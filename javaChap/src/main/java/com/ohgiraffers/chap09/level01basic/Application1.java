package com.ohgiraffers.chap09.level01basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) throws IOException {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sf = new StringBuilder(br.readLine());

        if(sf.charAt(0) >= 'a'){
            sf.insert(1,(char)(sf.charAt(0)-32));
            sf.deleteCharAt(0);
        }

        for(int i = 1; i < sf.length(); i++) {
            if(sf.charAt(i) == ' ' && sf.charAt(i+1) >= 'a') {
                sf.insert(i+2,(char)(sf.charAt(i+1)-32));
                sf.deleteCharAt(i+1);
            }
        }
        System.out.println(sf);
    br.close();

    }
}
