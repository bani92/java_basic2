package org.example.codeingTest.silver.binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 랜선자르기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        int max = 0;

        for(int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        long left = 1;
        long right = max;
        long result2 = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long result = 0;

            for(int i=0; i<K; i++) {
                result += arr[i] / mid;
            }

            if(result >= N) {
                result2 = mid; // 결과값 담기
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(result2);
    }
}







