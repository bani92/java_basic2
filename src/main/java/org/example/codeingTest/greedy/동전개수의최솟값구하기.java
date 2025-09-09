package org.example.codeingTest.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전개수의최솟값구하기 {
    static int[] arr;
    static int N, K;
    public static void main(String[] args) throws Exception {

        // 그리디 단점 : 잘 따져보지 않으면 반례
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];

        for(int i=0; i<N; i++) {
           arr[i] = Integer.parseInt(br.readLine());
        }

        // 그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0;
        for(int i = N-1; i>=0; i--) {
            if(arr[i] <= K) {
                count += K / arr[i];
                K = K % arr[i];
            }
        }

        System.out.println(count);

    }
}
