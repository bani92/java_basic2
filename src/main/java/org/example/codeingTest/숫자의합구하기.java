package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 숫자의합구하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(reader.readLine());
        char[] resultArray = reader.readLine().toCharArray();
        int sum = 0;
        System.out.println(Arrays.toString(resultArray));
        System.out.println(resultArray[0] - 48);
        for(int i=0; i<S; i++) {
            sum += (resultArray[i] - '0');
        }
        System.out.println(sum);
    }
}
