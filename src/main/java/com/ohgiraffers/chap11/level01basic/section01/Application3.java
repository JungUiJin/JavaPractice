package com.ohgiraffers.chap11.level01basic.section01;

import com.ohgiraffers.chap11.level01basic.exception.FileCantFoundException;

import java.io.*;

public class Application3 {
    public static void main(String[] args) throws FileCantFoundException {
        BufferedReader br1 = null;
        BufferedWriter bw = null;
        try {
            br1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("병합 할 파일 개수 입력 : ");
            int n = Integer.parseInt(br1.readLine());
            String[] fileNames = new String[n];

            for(int i = 0; i < n; i++) {
                System.out.print((i+1)+"번째 파일 이름 입력 : ");
                fileNames[i] = br1.readLine();
            }

            System.out.print("병합 될 파일 명 이름 : ");
            String mergeFile = br1.readLine();
            bw = new BufferedWriter(new FileWriter(mergeFile));
            for(int i = 0; i < n; i++) {
                if(!new File(fileNames[i]).exists()) {
                    throw new FileCantFoundException(fileNames[i]);
                }
                BufferedReader br2 = new BufferedReader(new FileReader(fileNames[i]));
                String s;
                while((s= br2.readLine()) != null) {
                    bw.write(s + "\n");
                }
            }
            System.out.println("파일 병합이 완료되었습니다.");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                br1.close();
                bw.flush();
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
