package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의명령 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 재료의 갯수
        int M = Integer.parseInt(br.readLine()); // 갑옷이 되는 번호

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0; i< N; i++) {
          arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int i = 0;
        int j = N - 1;
        int count = 0;
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum < M) i++;
            else if(sum > M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);



    }
}
