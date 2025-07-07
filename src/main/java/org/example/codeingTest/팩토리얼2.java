package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 팩토리얼2 {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(recursive(N));
    }

    public static int recursive(int N) {

        if (N <= 1) {
            return 1;
        }

        return N * recursive(N-1);
    }
}
