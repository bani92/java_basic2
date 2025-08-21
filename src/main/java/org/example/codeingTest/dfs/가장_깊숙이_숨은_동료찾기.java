package org.example.codeingTest.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 가장_깊숙이_숨은_동료찾기 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int maxDepth = -1;
    static int farthestNode = -1;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        // visited 초기화
        graph = new ArrayList<>();
        visited = new boolean[N + 1];

        for(int i=0;i<=N;i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1,0);
        System.out.println(farthestNode);
        System.out.println("maxDepth = " + maxDepth);
    }

    public static void dfs(int node, int depth) {

        if(depth > maxDepth) {
            maxDepth = depth;
            farthestNode = node;
        } else if(depth == maxDepth) {
            if(node < farthestNode) {
                farthestNode = node;
            }
        }

        // 가장 깊은 아지트가 여러개라면
        // 가장 번호가 작은 아지트 출력

        visited[node] = true;

        for(int nextNode : graph.get(node)) {
            if(!visited[nextNode]) {
                dfs(nextNode, depth + 1);
            }
        }
    }
}
