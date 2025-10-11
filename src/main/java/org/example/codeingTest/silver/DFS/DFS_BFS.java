package org.example.codeingTest.silver.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class DFS_BFS {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점갯수
        int M = Integer.parseInt(st.nextToken()); // 간선갯수
        int V = Integer.parseInt(st.nextToken()); // 시작할 정점 번호
        graph = new ArrayList<>();
        visited = new boolean[N + 1];
        sb = new StringBuilder();

        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for(int i=1; i<=N; i++) {
            graph.get(i).sort((a, b) -> a - b);
        }

        dfs(V);
        System.out.println(sb);

        sb.setLength(0);
        Arrays.fill(visited, false);

        bfs(V);
        System.out.println(sb);

    }

    private static void bfs(int V) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        while(!queue.isEmpty()) {
            int currentNum = queue.poll();
            sb.append(currentNum).append(" ");

            for (int nextNode : graph.get(currentNum)) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
            }


        }
    }

    private static void dfs(int V) {

        visited[V] = true;
        sb.append(V).append(" ");

        for(int nextNode : graph.get(V)) {
            if(!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}
