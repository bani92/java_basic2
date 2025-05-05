package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 평균구하기 {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int M = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] intArray = new int[M];
//        for(int i=0; i<M; i++) {
//            intArray[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int sum = Arrays.stream(intArray).sum();
//        int maxInt = Arrays.stream(intArray).max().getAsInt();
//
//        // 제일 큰 숫자를 구하기 - maxInt
//        // 각각의 숫자 / 제일 큰 숫자 * 100
//        // 계산된 항목들을 더한다 - sum
//        // 합계를 갯수만큼 나눈다 - M
//
//        // 총 더한값 * 100 / 최대값 / 갯수
//
//        System.out.println(sum * 100 / maxInt / M);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        long max = 0;

        for(int i =0; i<N ; i++) {
            if(A[i]>max) max = A[i];
            sum += A[i];
        }

        System.out.println(sum * 100.0 / max / N);
    }
}
