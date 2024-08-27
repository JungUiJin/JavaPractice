package com.ohgiraffers.chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<String> nameList = new LinkedList<String>();

        System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
        String name = "";
        try {
            while(!(name = br.readLine()).equals("exit")){
                if(name.equals("next")){
                    if(nameList.isEmpty()){
                        System.out.println("대기 고객이 없습니다.");
                    }else{
                        System.out.println(nameList.getFirst() + " 고객님 차례입니다.");
                        nameList.poll();
                    }
                }else{
                    nameList.add(name);
                    System.out.println(name + "님 대기 등록 되었습니다.");
                }
                System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
                System.out.println("프로그램을 종료합니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
