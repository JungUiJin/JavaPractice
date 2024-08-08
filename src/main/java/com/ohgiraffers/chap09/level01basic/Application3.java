package com.ohgiraffers.chap09.level01basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine().toLowerCase());
        // str 공백을 기준으로 잘라서 배열에 저장
        String[] strs = sb.toString().split(" ");



        System.out.println("======단어빈도======");



    }
}
