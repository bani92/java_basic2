package org.example.codeingTest.DFS_feat_GPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 특정거리의_도시찾기 {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] distance;
    static int N, M, K, X;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 도시의 개수
        M = Integer.parseInt(st.nextToken()); // 도로의 개수
        K = Integer.parseInt(st.nextToken()); // 거리정보
        X = Integer.parseInt(st.nextToken()); // 출발 도시의 번호

        graph = new ArrayList<>();
        distance = new int[N+1];

        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
            distance[i] = -1;
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }

        System.out.println(graph);

        distance[X] = 0;
        dfs(X, 0);

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (distance[i] == K) {
                resultList.add(i);
            }
        }

        System.out.println(Arrays.toString(distance));
        if (resultList.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(resultList);
            for (int city : resultList) {
                System.out.println(city);
            }
        }
    }

    public static void dfs(int node, int dist) {
        // 이미 더 짧은 경로로 이 노드를 방문했다면 더이상 탐색X (가지치기)
        if(distance[node] != -1 && distance[node] < dist) {
            return;
        }

        for(int nextNode : graph.get(node)) {
            // 다음 노드를 방문한 적이 없거나, 새로운 경로가 더 짧을 경우에만 탐색

            if(distance[nextNode] == -1 || distance[nextNode] > dist + 1) {
                distance[nextNode] = dist + 1;
                dfs(nextNode, dist + 1);
            }

        }
    }
}
