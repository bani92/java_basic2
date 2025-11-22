package org.example.codeingTest.구현.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 열개씩끊어출력하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N.length(); i++) {
            if(i > 0 && i % 10 == 0) {
                sb.append("\n");
            }
            sb.append(N.charAt(i));

        }


        System.out.println(sb.toString());
    }
}
