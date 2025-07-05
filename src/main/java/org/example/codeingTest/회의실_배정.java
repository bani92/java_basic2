package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 회의실_배정 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] arr = new long[N][2];


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            arr[i][0] = A;
            arr[i][1] = B;
        }

        Arrays.sort(arr, (a, b) -> {
            // 1. 끝나는 시간(a[1], b[1])이 같다면,
            if (a[1] == b[1]) {
                // 2. 시작 시간(a[0], b[0])을 기준으로 오름차순 정렬한다.
                return Long.compare(a[0], b[0]);
            }
            // 끝나는 시간이 다르다면, 원래대로 끝나는 시간을 기준으로 정렬한다.
            return Long.compare(a[1], b[1]);
        });

        // ---------- 정렬 완료

        int count = 1;
        long startNum = arr[0][0];
        long endNum = arr[0][1];

        // endNum이 startNum보다 작거나 같으면
        // startNum = arr[i][0];
        // endNum = arr[i][1];
        // count++;

        // 배열의 끝까지 돌리기
        for(int i=1; i<arr.length; i++) {

            if(endNum <= arr[i][0]) {
                startNum = arr[i][0];
                endNum = arr[i][1];
                count++;
            }

        }
        System.out.println(count);
    }
}
