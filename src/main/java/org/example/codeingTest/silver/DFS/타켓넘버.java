package org.example.codeingTest.silver.DFS;

public class 타켓넘버 {
    static int answer = 0;
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 4;
        dfs(numbers, target, 0, 0);
        System.out.println(answer);
    }

    private static void dfs(int[] numbers, int target, int index, int sum) {
        if(index == numbers.length) {
            if(sum == target) answer++;
            return;
        }

        dfs(numbers, target, index + 1, sum + numbers[index]);
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }



}
