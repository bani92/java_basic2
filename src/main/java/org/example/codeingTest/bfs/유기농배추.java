package org.example.codeingTest.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 유기농배추 {
    static boolean[][] visited;
    static int[][] map;          // 배추 위치 저장용
    static int M, N;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            int K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];
            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            int wormCount = 0;
            for(int x1=0; x1<M; x1++) {
                for(int y1=0; y1<N; y1++) {
                    if(!visited[y1][x1] && map[y1][x1] == 1) {
                        bfs(y1, x1);
                        wormCount++;
                    }
                }
            }

            sb.append(wormCount).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int y1, int x1) {

        Queue<int[]> queue = new LinkedList<>();
        visited[y1][x1] = true;
        queue.add(new int[]{x1, y1});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            for(int i=0; i<4; i++) {
                int nx = currentX + dx[i];
                int ny = currentY + dy[i];

                if(nx < 0 || ny < 0 || nx >= M || ny >= N) {
                    continue;
                }

                if(!visited[ny][nx] && map[ny][nx] == 1) {
                    visited[ny][nx] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
