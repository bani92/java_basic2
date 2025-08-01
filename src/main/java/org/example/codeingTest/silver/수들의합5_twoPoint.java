package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 수들의합5_twoPoint {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N) {
            if(sum == N) {
                count++;
                end_index++;
                sum += end_index;
            } else if(sum > N) {
                sum -= start_index;
                start_index++;
            } else if(sum < N) {
                end_index++;
                sum += end_index;
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
        br.close();

    }
}
