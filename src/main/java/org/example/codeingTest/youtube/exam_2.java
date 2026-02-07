package org.example.codeingTest.youtube;

import java.util.Arrays;

public class exam_2 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        arr[0] = 1;
        arr[1] = 1;

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        for(int i=2; i<10; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        // An
        int prevPrevNum = 1; // An-2
        int preNum = 1; // An-1
        System.out.print(prevPrevNum + " ");
        System.out.print(preNum + " ");
        for(int i=3; i<=10; i++) {
            int currentNum = prevPrevNum + preNum;
            System.out.print(currentNum + " ");
            prevPrevNum = preNum;
            preNum = currentNum;
        }

    }
}
