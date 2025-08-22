package org.example.codeingTest.gold.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M_1 {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int N, M;
    static int[] S;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 최대값
        M = Integer.parseInt(st.nextToken()); // 자릿 수

        visited = new boolean[N];
        S = new int[M];
        backtracking(0);
    }

    private static void backtracking(int length) {
        if(length == M) {
            for(int i=0; i<M; i++) {
                System.out.print(S[i] + 1 +" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++) { // 사용 가능한 모든 수를 탐색
            if(!visited[i]) {
                S[length] = i;
                visited[i] = true;
                backtracking(length + 1);
                visited[i] = false;
            }
        }

    }
}
