package org.example.codeingTest.silver.DFS;

public class 네트워크 {
    static boolean[] visited;
    static int[][] computers;
    static int n;
    public static void main(String[] args) {
        computers = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        n = 3;
        int answer = 0;
        visited = new boolean[3];

        for(int i=0; i<3; i++) {
           if(!visited[i]) {
               answer++;
               dfs(i);
           }
        }
        System.out.println(answer);
    }

    private static void dfs(int current) {
        visited[current] = true;

        for(int i=0; i<n; i++) {
            System.out.println("current = " + current + " | i = " + i);
            if(computers[current][i] == 1 && !visited[i]) {
                System.out.println("통과");
                System.out.println("i = " + i);
                dfs(i);
            }
        }
    }
}