package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 피보나치_수5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(pibonachi(N));
    }

    public static int pibonachi(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return pibonachi(N-1) + pibonachi(N-2);
    }
}
