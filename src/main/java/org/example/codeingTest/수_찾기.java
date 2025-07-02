package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수_찾기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] m1 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            m1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a); // 정렬

        for (int i=0; i<M; i++) {

            int start = 0;
            int end = a.length - 1;
            int target = m1[i];
            boolean found = false;

            while(start <= end) {
                int mid = (start + end) / 2;

                if(a[mid] == target) {
                    found = true;
                    break;
                } else if(a[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (found) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);

    }
}
