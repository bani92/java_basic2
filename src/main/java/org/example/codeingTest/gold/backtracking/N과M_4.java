package org.example.codeingTest.gold.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M_4 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1,0);

        System.out.println(sb.toString());
    }

    private static void dfs(int num, int depth) {
        if (depth == M) {
            for(int i=0; i<arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=num; i<=N; i++) {
            arr[depth] = i;

            dfs(i, depth + 1);
        }
    }
}
