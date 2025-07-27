package org.example.codeingTest.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 섬의개수 {
    static int width = 1, height = 1;
    static boolean[][] visited;
    static int[][] graph;
    // 기존 4방향           // 추가된 대각선 4방향
    static int[] dx = {0, 0, -1, 1,   -1,  1, -1,  1};
    static int[] dy = {-1, 1, 0, 0,   -1, -1,  1,  1};
    // 원래는 4군데 따져야하는데
    // 이제는 8군데 따져야함 (왼대각선 위, 왼대각선 아래, 오대각선 위, 오대각선 아래)
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0, 0을 적으면 br.readLine() 종료
        ArrayList<Integer> list = new ArrayList<>();

        int maxCount = 0;

        while(width > 0 && height > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());

            if(width == 0 && height == 0) {
                break;
            }
            visited = new boolean[height + 1][width + 1];
            graph = new int[height + 1][width + 1];

            for(int i=0; i<height; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<width; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int islandCount = 0; // [수정] 각 테스트 케이스마다 섬의 개수 초기화
            for(int i=0; i<height; i++) {
                for(int j=0; j<width; j++) {
                    if(!visited[i][j] && graph[i][j] == 1) {
                        islandCount++;
                        maxCount = Math.max(bfs(i, j), maxCount);
                    }
                }
            }
            list.add(islandCount);



        }

        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("maxCount = " + maxCount);
    }

    public static int bfs(int y, int x) {

        visited[y][x] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        int cnt = 0;

        while(!queue.isEmpty()) {
            cnt++;
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            for(int i=0; i<8; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];
                if(nextX < 0 || nextY < 0 || nextX >= width || nextY >= height) {
                    continue;
                }

                if(!visited[nextY][nextX] && graph[nextY][nextX] == 1) {
                    visited[nextY][nextX] = true;
                    queue.add(new int[]{nextX, nextY});
                }
            }

        }
        return cnt;
    }
}
