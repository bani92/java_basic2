package org.example.codeingTest.DFS_feat_GPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 바이러스 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int currentCnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();


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

        int maxCnt = 0;
        for(int i=1; i<=N; i++) {
            // dfs가 1번일때 4번인데
            // dfs가 2번일때 연결이 안되어있으면 갯수 cnt 세기
            visited = new boolean[N+1];
            currentCnt = 0;
            dfs(i);

            maxCnt = Math.max(maxCnt, currentCnt);
        }

        System.out.println(maxCnt);
    }

    public static void dfs(int value) {

        visited[value] = true;

        for(int nextNode : graph.get(value)) {
            if(!visited[nextNode]) {
                currentCnt++;
                dfs(nextNode);
            }
        }
    }
}
