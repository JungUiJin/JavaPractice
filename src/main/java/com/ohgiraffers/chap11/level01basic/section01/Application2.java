package com.ohgiraffers.chap11.level01basic.section01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String filename = sc.nextLine();

        System.out.println("복사 파일의 이름을 입력하세요 : ");
        String copyname = sc.nextLine();

        try {
            fr = new FileReader(filename);
            fw = new FileWriter(copyname);
            int value;
            while((value = fr.read()) != -1) {
                fw.write((char)value);
            }

        } catch (FileNotFoundException e) {
            System.out.println("오류 : " +filename+ " (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                    fw.flush();
                    fw.close();
                    System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
