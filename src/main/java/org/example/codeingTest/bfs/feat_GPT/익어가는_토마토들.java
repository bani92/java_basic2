package org.example.codeingTest.bfs.feat_GPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 익어가는_토마토들 {

    static int M, N;
    static int[][] graph;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        Queue<int[]> queue = new LinkedList<>();
        graph = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if(graph[i][j] == 1) {
                    queue.add(new int[]{j, i, 0});
                }
            }
        }

        int resultDay = bfs(queue);

        if(checkAllRipe()) {
            System.out.println(resultDay);
        } else {
            System.out.println(-1);
        }
    }

    public static int bfs(Queue<int[]> queue) {
        int maxDay = 0;

        while(!queue.isEmpty()) {

            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            int currentDist = current[2];


            maxDay = Math.max(maxDay, currentDist);

            for(int i=0; i<4; i++) {

                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) {
                    continue;
                }

                if(graph[nextY][nextX] == 0) {
                    graph[nextY][nextX] = 1;
                    queue.add(new int[]{nextX, nextY, currentDist + 1});
                }
            }
        }
        return maxDay;
    }

    public static boolean checkAllRipe() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(graph[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
