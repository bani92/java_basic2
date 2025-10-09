package org.example.codeingTest.누적합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수열_2559 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] sumArr = new int[N+1];
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i+1] += sumArr[i] + arr[i];
        }


        for(int i=M; i<sumArr.length; i++) {
            int result = sumArr[i] - sumArr[i-M];
            if(result > max) {
                max = result;
            }
        }

        System.out.println(max);
    }
}
