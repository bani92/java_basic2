package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int startIndex = 0;
        int endIndex = N-1;
        int count = 0;

        while(startIndex < endIndex) {

            int sum = arr[startIndex] + arr[endIndex];
            if(sum > M) {
                // arr[인덱스]의 합이 M보다 크면 endIndex--;
                endIndex--;
            } else if(sum < M) {
                // arr[인덱스]의 합이 M보다 작으면 startIndex++;
                startIndex++;
            } else {
                // 같으면 count++;
                count++;
                startIndex++;
                endIndex--;
            }
        }
        System.out.println(count);

    }
}
