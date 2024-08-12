package com.ohgiraffers.chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Application4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> idSet = new HashSet<String>();
        System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
        String id = "";

        try {
            while(!(id = br.readLine()).equals("exit")) {
                if(idSet.contains(id)) {
                    System.out.println("이미 등록 된 ID입니다.");
                } else {
                    idSet.add(id);
                    System.out.println("ID가 추가 되었습니다.");
                }
                System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
                System.out.println("모든 학생의 ID : " + idSet);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
