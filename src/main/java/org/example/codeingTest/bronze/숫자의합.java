package org.example.codeingTest.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 숫자의합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] charArray = br.readLine().toCharArray();
        int count = 0;
        for(int i=0; i<N; i++) {
            count += charArray[i] - '0';
        }

        System.out.println(count);

    }
}
