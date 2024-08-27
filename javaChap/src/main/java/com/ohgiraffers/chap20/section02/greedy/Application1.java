package com.ohgiraffers.chap20.section02.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Application1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        for(int i = 0; i < n; i++) {
            pq.offer(Long.parseLong(br.readLine()));
        }
        while(pq.size() > 1) {
            long a = pq.poll();
            long b = pq.poll();
            sum += a+b;
            pq.add(sum);
        }


        System.out.println(sum);
    }
}
