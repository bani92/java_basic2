package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자_카드 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] upArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            upArr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] downArr = new int[M];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<M; i++) {
            downArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(upArr);

        // 8번 돌아야함
        for(int i=0; i<M; i++) {
            int start = 0;
            int end = upArr.length - 1;

            boolean found = false;
            int target = downArr[i];

            while (start <= end) {
                int mid = (start + end ) / 2;

                if(upArr[mid] == target) {
                    found = true;
                    break;
                } else if(upArr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if(found) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }

        }
        System.out.println(sb);
    }
}
