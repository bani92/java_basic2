package org.example.codeingTest.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 잃어버린괄호 {
    static int answer;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("-");

        for(int i = 0; i < split.length; i++) {
            int result = mySum(split[i]);

            if(i==0) {
                answer += result;
            } else {
                answer -= result;
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String token) {
        String[] sumSplit = token.split("\\+");
        int sum = 0;
        for(int i = 0; i < sumSplit.length; i++) {
            sum += Integer.parseInt(sumSplit[i]);
        }
        return sum;
    }
}
