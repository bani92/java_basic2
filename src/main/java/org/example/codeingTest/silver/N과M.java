package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M {
    static int N, M;
    static boolean[] visited;
    static int[] S;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        S = new int[N];
        visited = new boolean[N];

        backtraking(0); // 현재 포함된 수열이 몇개냐
    }

    private static void backtraking(int length) {
        if(length == M) { // 정답인지 확인해서 return;
            // 수열 출력
            printArray();
            return;
        }

        for(int i=0; i<N; i++) { // 갈 수 있는 모든 선택지
            if(!visited[i]) {
                visited[i] = true;
                S[length] = i;
                backtraking(length + 1);
                visited[i] = false;
            }
        }
    }

    private static void printArray() {
        for(int i=0; i<M; i++) {
            System.out.print(S[i] + 1 + " ");
        }
    }
}
