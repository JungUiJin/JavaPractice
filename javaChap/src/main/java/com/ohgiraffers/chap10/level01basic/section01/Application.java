package com.ohgiraffers.chap10.level01basic.section01;

import com.ohgiraffers.chap10.level01basic.section01.exception.CantDivideException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws CantDivideException {
        try{

            Scanner sc = new Scanner(System.in);
            System.out.print("분자 입력 : ");
            int num1 = sc.nextInt();

            System.out.print("분모 입력 : ");
            int num2 = sc.nextInt();

            if(num2==0) throw new CantDivideException();
            System.out.println("결과 : " + (num1/num2));

        }catch (InputMismatchException e){
            System.out.println("정수를 입력하셔야 합니다.");
        }catch (CantDivideException e){
            System.out.println("분모가 0이면 안됩니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
