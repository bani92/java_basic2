package org.example.codeingTest.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 촌수계산 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N+1];
        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        int result = bfs(startNum, endNum);
        System.out.println(result);
    }

    public static int bfs(int start, int end) {

        // 7을 넣어서 7번째 배열을 확인한다.
        // 해당 배열의 item들을 큐에 넣는다.
        // 큐에 빼면서 해당 List에 접근한다.


        Queue<int[]> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(new int[]{start, 0});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNum = current[0];
            int distance = current[1];

            // 확인
            if(currentNum == end) {
                return distance;
            }

            for(int item : graph.get(currentNum)) {
                if(!visited[item]) {
                    visited[item] = true;
                    queue.add(new int[]{item, distance + 1});
                }
            }

        }
        return -1;
    }
}
