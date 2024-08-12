package com.ohgiraffers.chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Application6 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> phoneMap = new HashMap<>();
        String str = "";
        System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");

        try {
            while(!(str = br.readLine()).equals("exit")){
                StringTokenizer st = new StringTokenizer(str, " ");
                String key = st.nextToken();
                if(key.equals("search")){
                    System.out.print("검색 할 이름 : ");
                    key = br.readLine();
                    if(!phoneMap.containsKey(key)){
                        System.out.println(key+"씨의 번호는 등록 되어 있지 않습니다.");
                    }
                    else{
                        System.out.println(key+"씨의 전화번호 : " + phoneMap.get(key));
                    }
                }else if(st.hasMoreTokens()){
                    String value = st.nextToken();
                    phoneMap.put(key, value);
                    System.out.println("추가 완료 : " + key + " " + value);
                }else{
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }
                System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
                System.out.println("프로그램이 종료됩니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
