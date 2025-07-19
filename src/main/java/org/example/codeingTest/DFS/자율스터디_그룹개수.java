package org.example.codeingTest.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 자율스터디_그룹개수 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int M = Integer.parseInt(st.nextToken()); // 관계 수

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
                groupCount++;
                dfs(i);
            }
        }

        System.out.println(groupCount);

    }

    public static void dfs(int student) {
        visited[student] = true;

        for(int j : graph.get(student)) {
            if(!visited[j]) {
                dfs(j);
            }
        }
    }
}
