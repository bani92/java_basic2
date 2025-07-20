package org.example.codeingTest.DFS_feat_GPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 비밀메시지_전달가능성 {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static boolean arrived = false;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();

        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N+1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            graph.get(n).add(m);
            graph.get(m).add(n);
        }

        // 시작과 목표 스파이 번호 입력받기
        st = new StringTokenizer(br.readLine());
        int startNode = Integer.parseInt(st.nextToken());
        int endNode = Integer.parseInt(st.nextToken());

        // DFS 탐색시작
        dfs(startNode, endNode);

        if(arrived) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static void dfs(int currentNode, int targetNode) {
        // 이미 목표에 도착했다면 더 이상 탐색할 필요 없음
        if(arrived) return;

        // 현재 위치가 목표 지점이라면 도착!
        if (currentNode == targetNode) {
            arrived = true;
            return;
        }

        // 현재 위치 방문 처리
        visited[currentNode] = true;

        for(int nextNode : graph.get(currentNode)) {

            if(!visited[nextNode]) {
                dfs(nextNode, targetNode);
            }
        }

    }
}
