package com.ohgiraffers.chap11.level01basic.exception;

import java.io.FileNotFoundException;

public class FileCantFoundException extends FileNotFoundException {
    public FileCantFoundException(String fileName) {
        System.out.println("오류 : " +fileName+ "(지정된 파일을 찾을 수 없습니다.)");
    }
}
