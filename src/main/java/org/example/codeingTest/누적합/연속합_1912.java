package org.example.codeingTest.누적합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 연속합_1912 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int[] sumArr = new int[N + 1];
        int[] arr = new int[N];
        sumArr[0] = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i+1] = sumArr[i] + arr[i];
        }

        System.out.println(Arrays.toString(sumArr));
    }
}
