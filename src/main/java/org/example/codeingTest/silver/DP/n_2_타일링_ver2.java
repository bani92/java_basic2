package org.example.codeingTest.silver.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n_2_타일링_ver2 {
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        System.out.println(dp(N));
    }

    private static int dp(int N) {
        if(N == 1) return 1;
        if(N == 2) return 3;

        if(arr[N] != 0) return arr[N];

        return arr[N] = (dp(N - 1) + 2 * dp(N - 2)) % 10007;
    }
}
