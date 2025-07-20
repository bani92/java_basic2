package org.example.codeingTest.DFS_feat_GPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 안전영역 {

    static int N;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        graph = new int[N][N];

        int maxHeight = 0; // 가장 높은 땅의 높이
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if(graph[i][j] > maxHeight) {
                    maxHeight = graph[i][j];
                }
            }
        }

        int maxCount = 0;

        for(int h=0; h < maxHeight; h++) {
            visited = new boolean[N][N];
            int currentCount = 0;

            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {

                    if(graph[i][j] > h && !visited[i][j]) {
                        currentCount++;
                        dfs(i, j, h);
                    }
                }
            }
            maxCount = Math.max(maxCount, currentCount);
        }

        if(maxCount == 0) {
            System.out.println(1);
        } else {
            System.out.println(maxCount);
        }

    }

    public static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        // 상하좌우 네 방향으로 탐색
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N) {
                continue;
            }

            if(!visited[nx][ny] && graph[nx][ny] > height) {
                dfs(nx, ny, height);
            }
        }
    }
}
