package org.example.codeingTest;

import java.io.*;
import java.util.StringTokenizer;

public class 추첨_커피 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] answer = {100,100,200,200,300,300,400,400,500};
        int sum = 0;

        for(int i=0; i<answer.length; i++) {

            /**
             * 1. 배열보다 큰 수가 있을 경우 - hacker
             * 2. 입력한 숫자가 배열보다 작을경우 입력한 숫자를 sum , sum 의 결과값이 100이 넘지 않으면 - none
             * 3. 100을 넘으면 - draw
             */
            int diff = Integer.parseInt(st.nextToken());

            if(answer[i] < diff) {
                sb.append("hacker");
                break;
            } else if(answer[i] >= diff) {
                sum += diff;
            }

            if(i == answer.length -1) {
                if(sum >= 100) {
                    sb.append("draw");
                } else {
                    sb.append("none");
                }
            }

        }



        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
