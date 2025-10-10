package org.example.codeingTest.promgrammers;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int n, m;
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},
                        {1,0,1,0,1},
                        {1,0,1,1,1},
                        {1,1,1,0,1},
                        {0,0,0,0,1}};

        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];

        System.out.println(bfs(maps));
    }

    private static int bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            int currentDist = current[2];

            if(currentX == n - 1 && currentY == m - 1) {
                return currentDist;
            }

            for(int i=0; i<4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
                    if(maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        queue.add(new int[]{nextX, nextY, currentDist + 1});
                    }

                }
            }
        }
        return -1;
    }
}
