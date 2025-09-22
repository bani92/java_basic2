package org.example.codeingTest.silver.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 쿼드트리 {
    static int[][] arr;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        arr = new int[N][N];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        partition(0, 0, N);


        System.out.println(sb.toString());
    }

    private static void partition(int row, int col, int size) {

        if (rowCheck(row, col, size)) {
            sb.append(arr[row][col]);
            return;
        }
        sb.append("(");
        int newSize = size / 2;
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        sb.append(")");
    }

    private static boolean rowCheck(int row, int col, int size) {

        int diffNum = arr[row][col];
        for(int i=row; i<row +size; i++) {
            for(int j=col; j<col + size; j++) {
                if(diffNum != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }
}