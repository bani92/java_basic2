package org.example.codeingTest.DFS_feat_GPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연결요소_개수세기 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        // 그룹 갯수 파악하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        visited = new boolean[N+1];


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

        System.out.println(graph);
        int groupCount = 0;
        for(int i=1; i<=N; i++) {
            if(!visited[i]) {
                groupCount++; // 새로운 탐색 직전에 카운트
                dfs(i);
            }
        }

        System.out.println(groupCount);
    }

    public static void dfs(int value) {
        visited[value] = true;


        for(int item : graph.get(value)) {
            if(!visited[item]) {
                dfs(item);
            }
        }
    }
}
