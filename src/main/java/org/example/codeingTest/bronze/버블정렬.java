package org.example.codeingTest.bronze;

import java.util.Arrays;

public class 버블정렬 {
    static int i, j, temp;
    public static void main(String[] args) {
        int[] arr = {1, 10, 5 , 8, 7, 6, 4, 3, 2, 9};
        for(i=0; i<arr.length; i++){
            for(j=0; j<arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
