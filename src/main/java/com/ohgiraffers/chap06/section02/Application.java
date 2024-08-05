package com.ohgiraffers.chap06.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String flag = "y";

        while(count<10&&flag.equals("y")){
            System.out.print("학년 : ");
            int grade = sc.nextInt();

            System.out.print("반 : ");
            int classroom = sc.nextInt();

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();

            System.out.print("영어점수 : ");
            int eng = sc.nextInt();

            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;
            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            flag = sc.next();
        }

        for(StudentDTO student : students){
            if(student != null) student.getInformation();
        }

    }
}
