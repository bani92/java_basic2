package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 두수의합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort((a, b) -> a - b);

        int X = Integer.parseInt(br.readLine());

        int start_index = 0;
        int end_index = N-1;

        int count = 0;

        while(start_index < end_index) {
            int sum = list.get(start_index) + list.get(end_index);

            if(sum == X) {
                count++;
                start_index++;
            } else if(sum > X) {
                end_index--;
            } else if(sum < X) {
                start_index++;
            }
        }
        System.out.println(count);
    }
}
