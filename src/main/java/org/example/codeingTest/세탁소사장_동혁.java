package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 세탁소사장_동혁 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = {25,10,5,1};
        /**
         * 쿼터 : 25
         * 다임 : 10
         * 니켈 : 5
         * 페니 : 1
         */
        for (int i = 0; i < T; i++) {
            int answer = Integer.parseInt(br.readLine());

            for(int j = 0; j < arr.length; j++) {
                int a = answer / arr[j];
                answer = answer % arr[j];
                sb.append(a).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
