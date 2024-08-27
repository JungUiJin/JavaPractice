package com.ohgiraffers.chap09.level01basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) throws IOException {
        /* ======== map쓰는 방법 ======== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.toLowerCase();
        StringTokenizer st = new StringTokenizer(str, " ");

        HashMap<String, Integer> map = new HashMap<>();

        while (st.hasMoreTokens()) {
            String word = st.nextToken().replaceAll("[^a-zA-Z0-9]", "");
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }

        System.out.println("==== 단어 빈도 ====");

        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        int maxNum = 0;
        String maxValue = "";
        for(String key : map.keySet()) {
            if(map.get(key) > maxNum) {
                maxNum = map.get(key);
                maxValue = key;
            }

        }
        System.out.println("가장 빈도 높은 단어 : "+maxValue +"("+maxNum+")");
        br.close();
    }
}
