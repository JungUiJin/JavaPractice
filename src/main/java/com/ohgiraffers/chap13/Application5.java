package com.ohgiraffers.chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Application5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> wordList = new ArrayList<String>();
        String word = "";
        System.out.print("단어 입력 ('exit' 입력 시 종료): ");

        try {
            while(!(word = br.readLine()).equals("exit")) {
                wordList.add(word);
                System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String[] words = wordList.toArray(new String[wordList.size()]);
        Arrays.sort(words,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(words));

    }
}
