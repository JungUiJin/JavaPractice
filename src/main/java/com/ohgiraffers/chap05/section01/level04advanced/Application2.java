package com.ohgiraffers.chap05.section01.level04advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */

        // 정답 저장할 배열 선언 및 할당
        int[] nums = new int[4];
        // 첫번째 인덱스에 넣을 난수 생성
        int ranNum = (int)(Math.random() * 10);
        // 첫번째 인덱스에 난수 삽입
        nums[0] = ranNum;
        // 중복 없이 배열 채우기
        for(int i = 1; i < 4; i++) {
            // 난수 생성
            ranNum = (int) (Math.random() * 10);
            // 중복 확인을 위한 반복문
            for (int j = 0; j < i; j++) {
                // 중복일 경우 i를 하나 줄여 다시 난수를 생성하기
                if (nums[j] == ranNum) {
                    i--;
                    // 중복 발견된 순간 중복 찾는 반복문 종료
                    break;
                } else {
                    // 중복 아닐 경우 삽입.
                    nums[i] = ranNum;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        // 스트라이크, 볼 개수 저장할 변수 생성
        int sNum = 0;
        int bNum = 0;
        // 남은 정답 개수 변수 선언
        int count= 10;

        Scanner sc = new Scanner(System.in);

        // 정답 4자리 각각 문자로 저장할 배열 선언
        char[] answer;
        // answer[]를 int형으로 변환하여 저장할 배열 선언
        int[] answerArr = new int[4];
        //구분선

        // 정답 맞추기 시작
        duplicateNum:
        for (int i = 0; i < 10; i++) {
            System.out.println("============");
            System.out.println("남은 기회 : " + count);
            System.out.println("4자리 숫자를 입력하시오.");
            answer = sc.nextLine().toCharArray();

            for (int j = 0; j < 4; j++) {
                for(int k = 0; k < 4; k++) {
                    if (answer[j] == answer[k] && j!=k) {
                        System.out.println("정수 4자리중 중복값이 없어야 합니다.");
                        if(i!=0) { i--; }
                        continue duplicateNum;
                    }
                }
            }

            // 입력받은 숫자 4자리 배열에 저장
            for (int j = 0; j < 4; j++) {
                answerArr[j] = Integer.parseInt(String.valueOf(answer[j]));
            }

            // 같은값이 있는지 확인
            for(int k = 0; k < 4; k++) {
                for (int l = 0; l < 4; l++) {
                    if(nums[k]==answerArr[l]) {
                        if(k==l) { sNum++; break;}
                        else { bNum++; break;}
                    }
                }
            }

            if(sNum==4){
                System.out.println("정답입니다!");
                return;
            }
            else{
                System.out.println(sNum+"S "+bNum+"B 입니다.");
                count --;
                sNum = 0;
                bNum = 0;
            }
        }
        System.out.println("실패!!!!!!");
    }
}
