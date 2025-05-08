package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 슬라이딩윈도우 {
    static int[] myArr;
    static int[] checkArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 문자열 크기
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열 크기
        int Result = 0;
        checkArr = new int[4];
        myArr = new int[4];
        char[] A = new char[S];
        checkSecret = 0;

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) {
                checkSecret++;
            }
        }

        // 부분문자열 처음 받을때 세팅
        for(int i=0; i<P ; i++) {
            Add(A[i]);
        }

        if(checkSecret == 4) Result++;

        // 슬라이딩윈도우 START
        for(int i=P; i<S; i++) {

            // P = 8 , S = 9
            // i = 8
            // j = 0

            // P = 2 , S = 4
            // i = 2,3
            // j = 0,1

            // i는 부분 문자열 크기(P)
            // 문자열 크기(S)
            // 맨왼쪽 j , 맨오른쪽 i
            int j = i - P;
            Add(A[i]); // 오른쪽으로 이동시 이동한 오른쪽 한칸을 Add
            Remove(A[j]); // 오른쪽으로 이동시 이동한 왼쪽 한칸을 Remove
            if(checkSecret == 4) Result++;
        }

        System.out.println(Result);
        br.close();

    }

    private static void Add(char c) {
        //  A C G T
        switch (c) {
            case 'A' :
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C' :
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G' :
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T' :
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A' :
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C' :
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G' :
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T' :
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}
