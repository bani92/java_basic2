package org.example.codeingTest.youtube;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exam_7 {
    public static void main(String[] args) throws Exception {
        // 소수 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean isPrimeNumber = true;

        for (int i = 2; i <=  Math.sqrt(num); i++) {
            if(num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if(isPrimeNumber) {
            System.out.println(num + " 은 소수입니다.");
        } else {
            System.out.println(num + " 은 소수가 아닙니다.");
        }

    }
}
