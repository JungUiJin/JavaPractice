package com.ohgiraffers.chap20.section01.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application1 {

    static int N; // x좌표
    static int M; // y좌표
    static int K; // 사각형 개수
    static int[][]map;
    static boolean[][] visited;
    static int areaCount = 0;
    static int cx,cy;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static int size;
    static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visited = new boolean[M][N];
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int j = y1; j < y2; j++) {
                for(int k = x1; k < x2; k++) {
                    map[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 0) {
                    areaCount++;
                    size=1;
                    dfs(i,j);
                    result.add(size);
                }
            }
        }
        Collections.sort(result);
        sb.append(areaCount).append("\n");
        for(int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append(" ");
        }
        System.out.println(sb.toString());


    }
    static void dfs(int y, int x) {
        map[y][x] = 1;
            for(int k = 0; k < 4; k++) {
                cx = dirX[k]+x;
                cy = dirY[k]+y;
                if (range_check() && map[cy][cx] == 0) {
                    size++;
                    dfs(cy,cx);
                }
            }
    }
    private static boolean range_check() {
        return cx >= 0 && cx < N && cy >= 0 && cy < M;
    }
}
