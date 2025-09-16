package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 소수구하기_1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        for(int i=1; i<=N; i++) {
            arr[i] = i;
        }
        for(int j=2; j<=(int)Math.sqrt(N); j++) {
            // 소수가 아니면 넘어감
            if(arr[j] == 0) continue;
            for(int i=j+j; i<=N; i=i+j) {
                arr[i] = 0;
            }

        }

        for(int i=M; i<=N; i++) {
            if(arr[i] != 0) {
                bw.write(arr[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
