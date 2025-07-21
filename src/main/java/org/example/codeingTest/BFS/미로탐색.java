package org.example.codeingTest.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int N,M;
    static boolean[][] visited;
    static int[][] graph;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String line = br.readLine();
            for(int j=0; j<M; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 1});
        visited[y][x] = true;

        while(!queue.isEmpty()) {

            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            int currentDist = current[2];

            if(currentX == M -1 && currentY == N - 1) {
                System.out.println(currentDist);
                return;
            }

            for(int i=0; i<4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) {
                    continue;
                }

                if(visited[nextY][nextX] || graph[nextY][nextX] == 0) {
                    continue;
                }

                queue.add(new int[]{nextX, nextY, currentDist + 1});
                visited[nextY][nextX] = true;
            }
        }

    }
}
