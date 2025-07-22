package org.example.codeingTest.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 연결요소의개수 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        visited = new boolean[N+1];
        int result = 0;

        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=1; i<=N; i++) {

            if(!visited[i]) {
                result++;
                bfs(i);
            }
        }
        System.out.println(result);
    }

    public static void bfs(int startNode) {
        visited[startNode] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);

        while(!queue.isEmpty()) {
            int current = queue.poll();

            for(int nextNode : graph.get(current)) {
                if(!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
            }
        }

    }
}
