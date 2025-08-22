package org.example.codeingTest.gold.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_Queen {
    static int[] A;
    static int N;
    static int cnt = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        backtracking(0);
        System.out.println(cnt);

    }

    private static void backtracking(int row) {
        // 가능한 선택지 탐색
        // 유효성 검사 및 가지치기
        // 해답 도출

        if(row == N) {
            cnt++;
            return;
        }

        for(int i=0; i<N; i++) {
            A[row] = i;
            if(check(row)) { // 가지치기 유효성검사
                backtracking(row + 1);
            }
        }
    }

    private static boolean check(int row) {
        for(int i=0; i<row; i++) { // 현재까지 배치된 퀸들을 조회
            if(A[i] == A[row]) return false;// 직선 공격
            if(Math.abs(row - i) == Math.abs(A[row] - A[i])) return false; // 대각선 공격
        }
        return true;
    }
}
