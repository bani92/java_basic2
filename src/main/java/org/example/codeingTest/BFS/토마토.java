package org.example.codeingTest.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토 {

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int M,N;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로
        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++) { // 세로
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) { // 가로
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++) { // 세로
            for(int j=0; j<M; j++) { // 가로
                if(arr[i][j] == 1) {
                    queue.add(new int[]{j, i});
                }
            }
        }

        bfs(arr);

        int maxDay = 0;

        for(int i=0; i<N; i++) { // 세로
            for(int j=0; j<M; j++) { // 가로
                if(arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                maxDay = Math.max(maxDay, arr[i][j]);
            }
        }
        // 결과 판독
        System.out.println(maxDay - 1);

    }

    private static void bfs(int[][] arr) {

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int ragX = current[0]; // 가로
            int ragY = current[1]; // 세로

            for(int i=0; i<4; i++) {
                int nx = ragX + dx[i];
                int ny = ragY + dy[i];

                if(nx < 0 || ny < 0 || nx >= M || ny >= N) {
                    continue;
                }

                if(arr[ny][nx] == 0) {

                    arr[ny][nx] = arr[ragY][ragX] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}