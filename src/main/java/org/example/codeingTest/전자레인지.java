package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 전자레인지 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] answer = {100,200,300};
        int A = 300;
        int B = 60;
        int C = 10;

        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;

        while(T/A != 0) {
            T -= A;
            aCnt++;
        }

        while(T/B != 0) {
            T -= B;
            bCnt++;
        }

        while(T/C != 0) {
            T -= C;
            cCnt++;
        }

        if(T != 0) {
            System.out.println(-1);
        } else {
            System.out.println(aCnt + " " + bCnt + " " + cCnt);
        }
    }
}
