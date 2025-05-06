package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 연속된자연수의합구하기 {
    public static void main(String[] args) throws Exception{
        // 투포인터
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if(sum==N) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if(sum > N) {
                // 순서중요
                sum = sum - start_index;
                start_index++;
            } else {
                // sum < N
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
