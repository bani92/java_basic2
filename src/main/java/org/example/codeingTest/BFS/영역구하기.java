package org.example.codeingTest.BFS;

import org.example.methodref.Person;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 영역구하기 {
    static int M, N, K;
    static boolean[][] visited;
    static int[][] graph;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 세로
        N = Integer.parseInt(st.nextToken()); // 가로
        K = Integer.parseInt(st.nextToken()); // 갯수

        visited = new boolean[M][N];
        graph = new int[M][N];

        ArrayList<Integer> list = new ArrayList<>();

        for(int z=0; z<K; z++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); // 0
            int y1 = Integer.parseInt(st.nextToken()); // 2
            int x2 = Integer.parseInt(st.nextToken()); // 4
            int y2 = Integer.parseInt(st.nextToken()); // 4

            for(int i=x1; i<x2; i++) {
                for(int j=y1; j<y2; j++) {
                    graph[j][i] = 1;
                }
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && graph[i][j] == 0) {
                    int data = bfs(i, j);
                    list.add(data);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for(int item : list) {
            System.out.print(item + " ");
        }

    }

    public static int bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[y][x] = true;
        int cnt = 1;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            for(int i=0; i<4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }

                if(!visited[nextY][nextX] && graph[nextY][nextX] == 0) {
                    visited[nextY][nextX] = true;
                    queue.add(new int[]{nextX, nextY});
                    cnt++;
                }
            }

        }
        return cnt;

    }



}
