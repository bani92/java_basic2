package org.example.codeingTest.silver.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 종이의개수 {
    static int[][] arr;
    static int zero, one, minusOne;
    public static void main(String[] args) throws Exception{
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

        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);
    }

    private static void partition(int row, int col, int size) {

        if(checkRow(row, col, size)) {
            if(arr[row][col] == 1) {
                one++;
            } else if(arr[row][col] == 0) {
                zero++;
            } else {
                minusOne++;
            }
            return;
        }

        int newSize = size / 3;
        partition(row , col, newSize);
        partition(row , col + newSize, newSize);
        partition(row , col + newSize * 2, newSize);
        partition(row + newSize , col, newSize);
        partition(row + newSize , col + newSize, newSize);
        partition(row + newSize , col + newSize * 2, newSize);
        partition(row + newSize * 2 , col, newSize);
        partition(row + newSize * 2 , col + newSize, newSize);
        partition(row + newSize * 2 , col + newSize * 2, newSize);

    }

    private static boolean checkRow(int row, int col, int size) {

        int diffNum = arr[row][col];

        for(int i=row; i< row + size; i++) {
            for(int j=col; j <col + size; j++) {
                if(arr[i][j] != diffNum) {
                    return false;
                }
            }
        }
        return true;
    }
}
