package org.example.codeingTest.silver.binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 원하는정수찾기 {
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            int searchNum = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(searchNum)).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int binarySearch(int searchNum) {

        int start = 0;
        int end = arr.length - 1;

        boolean found = false;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == searchNum) {
                found = true;
                break;
            } else if(arr[mid] < searchNum) {
                start = mid + 1;
            } else if(arr[mid] > searchNum) {
                end = mid - 1;
            }
        }

        return found ? 1 : 0;

    }
}
