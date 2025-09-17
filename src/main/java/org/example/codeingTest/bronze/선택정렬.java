package org.example.codeingTest.bronze;

public class 선택정렬 {
    static int i, j, min, index, temp;
    public static void main(String[] args) {
        int[] arr = {1, 10, 5 , 8, 7, 6, 4, 3, 2, 9};
        for(i=0; i< arr.length; i++) {
            min = Integer.MAX_VALUE;
            for(j=i; j<arr.length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
    }
}
