package org.example.codeingTest.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이_재귀 {
    static boolean[] isSelected;
    static int[] arr;
    static boolean found = false;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        isSelected = new boolean[9];

        Arrays.sort(arr);

        findDwarfs(0, 0, 0);

    }

    public static void findDwarfs(int index, int count, int currentSum) {

        if(found) return;

        if(count == 7 && currentSum == 100) {
            found = true;
            for(int i=0; i<9; i++) {
                if(isSelected[i]) {
                    System.out.println(arr[i]);
                }
            }
            return;
        }
        if (count > 7 || index == 9 || currentSum > 100) {
            return; // 이 경로는 정답이 될 수 없으니 종료
        }

        isSelected[index] = true;
        findDwarfs(index + 1, count + 1, currentSum + arr[index]);

        isSelected[index] = false;
        findDwarfs(index + 1, count, currentSum);
    }

}
