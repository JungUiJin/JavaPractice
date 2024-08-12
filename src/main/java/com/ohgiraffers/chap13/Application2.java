package com.ohgiraffers.chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        List<String> urlList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> urlQueue = new LinkedList<String>();
        String url = "";
        System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
        try {
            while (!(url = br.readLine()).equals("exit")){
                urlQueue.offer(url);
                if(urlQueue.size() > 5){ urlQueue.poll(); }
                System.out.println(urlQueue);
                System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
                System.out.println("프로그램을 종료합니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
