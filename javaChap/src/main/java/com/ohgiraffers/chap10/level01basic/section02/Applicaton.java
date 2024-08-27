package com.ohgiraffers.chap10.level01basic.section02;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Applicaton {
    public static void main(String[] args) throws InvalidAgeException{
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");

            String birthStr = sc.nextLine();
            // 생년월일
            LocalDate birth = LocalDate.parse(birthStr);
            // 현재로부터 20년 전
            LocalDate before20 = LocalDate.now().minusYears(20);

            if(before20.isBefore(birth)) {
                throw new InvalidAgeException();
            } else {
                System.out.println("입장 가능합니다.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("만 20세 미만은 입장 불가입니다.");
        } catch (DateTimeParseException e) {
            System.out.println("올바른 형식을 입력해야 합니다.");
        }

    }
}
