package com.ohgiraffers.chap20.section02.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application2 {

    static int N;
    static int now;
    static long totalPrice;
    static long[] load;
    static long[] oilPrice;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        load = new long[N-1];
        oilPrice = new long[N];

        now = 0;
        totalPrice = 0;
        for (int i = 0; i < N-1; i++) {
            load[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            oilPrice[i] = Long.parseLong(st.nextToken());
        }
        long minOil = oilPrice[0];

        while(now!=N-1){
            totalPrice += minOil*load[now];
            if(oilPrice[now]<=oilPrice[now+1]){
                now++;
            }else{
                minOil = oilPrice[now+1];
                now++;
            }
        }
        System.out.println(totalPrice);
    }
}
