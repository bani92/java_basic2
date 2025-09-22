package org.example.codeingTest.silver.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
    static int[][] arr;
    static int white, blue;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        System.out.println(white);
        System.out.println(blue);



    }

    private static void partition(int row, int col, int size) {

        if(colorCheck(row, col, size)) {
            if(arr[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = size / 2; // 절반 사이즈

        partition(row, col, newSize); // 1사
        partition(row, col + newSize, newSize); // 2사
        partition(row + newSize, col, newSize); // 3사
        partition(row + newSize, col + newSize, newSize); // 4사

    }

    private static boolean colorCheck(int row, int col, int size) {

        int color = arr[row][col];

        for(int i = row; i < row + size; i++) {
            for(int j = col; j< col + size; j++) {
                if(arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}

