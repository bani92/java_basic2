package org.example.codeingTest.silver.binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무자르기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int maxTree = 0;
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            // 입력 받으면서 가장 높은 나무의 높이 찾기
            if(arr[i] > maxTree) {
                maxTree = arr[i];
            }
        }

        int left = 0;
        int right = maxTree;
        int answer = 0; // 조건에 만족하는 높이의 최댓값을 저장할 변수

        while(left <= right) {
            int mid = left + (right - left) / 2;

            long sum = 0;
            for(int item : arr) {
                if(item > mid) {
                    sum += item - mid;
                }
            }

            if (sum >= M) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}