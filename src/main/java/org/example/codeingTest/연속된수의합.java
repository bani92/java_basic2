package org.example.codeingTest;

import java.util.Arrays;

public class 연속된수의합 {
    public static void main(String[] args) {

        int num = 5;
        int total = 5;

        int[] answer = new int[num];

        int middleNumber = total / num;
        System.out.println("middleNumber = " + middleNumber);
        int subtracNumber = total % num == 0 ? num / 2 : num / 2 - 1;
        System.out.println("subtracNumber = " + subtracNumber);

        int startNumber = middleNumber - subtracNumber;
        System.out.println("startNumber = " + startNumber);

        for (int i = 0; i < num; i++) {
            answer[i]= startNumber + i;
        }
        System.out.println(Arrays.toString(answer));
    }
}
