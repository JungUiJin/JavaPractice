package com.ohgiraffers.chap11.level01basic.section01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        FileReader fr = null;
        System.out.print("파일 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        try {
            fr = new FileReader(filename);
            int value;
            while((value = fr.read()) != -1) {
	            System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
