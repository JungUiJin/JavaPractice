package com.ohgiraffers.chap20.section03.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        int max = 1;
        for(int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                /* 앞에 위치한 추가 기준 인덱스 값보다 작다면 증가 수열의 일부로 볼 수 있다. */
                if(arr[i]>arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);;
    }
}
