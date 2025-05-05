package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 구간합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // INT ARRAY = M
        // 횟수 = N
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] S = new long[M+1];

        /**
         * 1. A배열에 M번 만큼 숫자 넣기
         * 2. 초기값 셋팅
         * 3. 합 배열 생성
         * 4. 질의 범위 받기
         * 5. 구간합 출력
         */
//        long[] A = new long[M];
//        st = new StringTokenizer(br.readLine());
//        // A배열에 M번 만큼 숫자 넣기
//        for(int i=0; i<M; i++) {
//           A[i] = Integer.parseInt(st.nextToken());
//        }
//
//        S[0] = A[0]; // 초기값 셋팅
//
//        // 합 배열 생성
//        for(int i=1; i<M; i++) {
//            S[i] = S[i-1] + A[i];
//        }
//
//        // 질의 범위 받기
//        for(int i=0; i<N; i++) {
//            st = new StringTokenizer(br.readLine());
//            int start = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
//            System.out.println(S[end] - S[start - 1]);
//        }

        // 해설
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=M; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        // 질의 범위 받기
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(S[end] - S[start - 1]);
        }


        // 5 3
        // 1 2 3 4 5
        // 2 4 -> 9
        // 3 5 -> 12
        // 1 5 -> 15
    }
}
