package com.ohgiraffers.chap20.section01.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Application2 {
    static int[][] map;
    static int N;
    static int townNum;
    static int size;
    static int cx,cy;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        map = new int[N][N];
        visited = new boolean[N][N];
        townNum = 0;
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(map[i][j]==1&&!visited[i][j]) {
                    size = 1;
                    townNum++;
                    dfs(i,j);
                    result.add(size);
                }
            }
        }
        Collections.sort(result);
        sb.append(townNum).append("\n");
        for(int i=0; i<result.size(); i++) {
            sb.append(result.get(i)).append("\n");
        }
        System.out.println(sb.toString());

    }
    static void dfs(int i, int j) {
        visited[i][j] = true;
        for(int k = 0; k<4; k++) {
            cx = i+dirX[k];
            cy = j+dirY[k];
            if(range_check()&&map[cx][cy]==1&&!visited[cx][cy]) {
                size++;
                dfs(cx,cy);
            }
        }
    }
    private static boolean range_check() {
        return cx >= 0 && cx < N && cy >= 0 && cy < N;
    }
}
