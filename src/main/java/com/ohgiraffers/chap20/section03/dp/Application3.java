package com.ohgiraffers.chap20.section03.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        int[] dpUp = new int[n+1];
        int[] dpDown = new int[n+1];
        int maxUp = 0;
        int maxDown = 0;
        int result = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dpUp[i] = 1;
            dpDown[i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dpUp[i] = Math.max(dpUp[i], dpUp[j] + 1);
                }
            }
        }
        for(int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                if(arr[i]>arr[j]) {
                    dpDown[i] = Math.max(dpDown[i], dpDown[j]+1);
                }
            }
        }
        System.out.println(Arrays.toString(dpUp));
        System.out.println(Arrays.toString(dpDown));
        for(int i = 1; i <= n; i++){
            max = Math.max(max, dpUp[i] + dpDown[i]-1);
        }
        System.out.println(max);
    }
}
