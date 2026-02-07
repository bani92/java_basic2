package org.example.codeingTest.youtube;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class exam_3 {
    public static void main(String[] args) throws Exception {

        int[] inputNum = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<10 ; i++) {
            inputNum[i] = Integer.parseInt(br.readLine());
        }

        int[] mode = new int [10];

        for(int i=0; i<10; i++) {
            mode[inputNum[i]]++;
        }

        System.out.println(Arrays.toString(mode));

        int modeNum = 0;
        int modeCnt = 0;

        for(int i=0; i<10; i++) {
            if(mode[i] > modeCnt) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println(modeNum + "이 나온 횟수 : " + modeCnt);

        int modeNum1 = IntStream.range(0, mode.length)
                .reduce((i, j) -> mode[i] >= mode[j] ? i : j)
                .orElse(-1);

        int modeCnt1 = mode[modeNum1];

        System.out.println(modeNum1 + "이 나온 횟수 : " + modeCnt1);
//        int maxInt = Arrays.stream(mode).max().getAsInt();
//
//        System.out.println(maxInt);
    }
}
