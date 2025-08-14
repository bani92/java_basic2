package org.example.codeingTest.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int A[] = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i,i+1));
        }

        // 선택정렬
        for(int i=0; i<str.length(); i++) {
            int Max = i;
            for(int j=i+1; j<str.length(); j++) {
                if(A[j] > A[Max]) {
                    Max = j;
                }
            }
            if(A[i] < A[Max]) {
                int tmp = A[i];
                A[i] = A[Max];
                A[Max] = tmp;
            }
        }

        // 버블정렬
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(A[i] < A[j]) {
                    int tmp = A[j];
                    A[j] = A[i];
                    A[i] = tmp;
                }
            }
        }

        for(int i=0; i<str.length(); i++) {
            System.out.print(A[i]);
        }


    }
}
