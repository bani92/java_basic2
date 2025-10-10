package org.example.codeingTest.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int totalSum = 0;
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            totalSum += arr[i];
        }

        int sumOfTwoExclude = totalSum - 100;

        Arrays.sort(arr);

        int one = 0;
        int two = 0;
        // 모든 경우의 수 뽑기
        for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {
                if(arr[i] + arr[j] == sumOfTwoExclude) {
                    one = arr[i];
                    two = arr[j];

                }
            }
        }

        for(int i=0; i<9; i++) {
            if(arr[i] == one || arr[i] == two) continue;
            System.out.println(arr[i]);
        }

    }
}
