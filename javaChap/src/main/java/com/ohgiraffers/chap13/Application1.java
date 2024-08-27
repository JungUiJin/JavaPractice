package com.ohgiraffers.chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* 학생들의 점수를 입력받아 저장한 후,
        평균 점수를 계산하여 출력하는 프로그램을 작성하세요. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> scores = new ArrayList<Integer>();
        char status = 'y';
        double scoreSum = 0;
        try {
            while (status == 'y') {
                System.out.print("학생 성적 : ");
                scores.add(Integer.parseInt(br.readLine()));
                System.out.print("추가 입력하려면 y : ");
                status = br.readLine().charAt(0);
                while (status != 'y' && status != 'n') {
                    System.out.println("y/n 중 하나의 값을 입력하시요.");
                    System.out.print("추가 입력하려면 y : ");
                    status = br.readLine().charAt(0);
                }
            }
            for (int i = 0; i < scores.size(); i++) {
                scoreSum += scores.get(i);
            }
            System.out.println("학생 인원 : " + scores.size());
            System.out.println("평균 점수 : " + (scoreSum/scores.size()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
