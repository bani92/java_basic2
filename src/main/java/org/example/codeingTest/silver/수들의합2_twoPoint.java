package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수들의합2_twoPoint {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        int start_index = 0;
        int end_index = 0;
        int sum = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(start_index < N) {
            if(sum < M && end_index < N) {
                sum += arr[end_index];
                end_index++;
            } else {
                if(sum == M) {
                    count++;
                }
                sum -= arr[start_index];
                start_index++;
            }
        }

        System.out.println(count);

    }
}


