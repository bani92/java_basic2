package org.example.codeingTest.greedy;

public class 체육복withArray {
    public static void main(String[] args) {

        int[] lost = {3};
        int[] reverse = {1};
        체육복withArray solver = new 체육복withArray();
        System.out.println(solver.solution(3,lost,reverse));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 배열생성
        int[] result = new int[n + 2];

        // 초기화
        for(int item : lost) {
            result[item] = -1;
        }

        for(int item : reserve) {
            result[item] += 1;
        }

        // 여분을 기준으로 앞뒤를 확인하여 체육복을 빌려준다
        for(int i=1; i<=n; i++) {
           if(result[i] == 1) {
               if(result[i-1] == -1) {
                   result[i]--;
                   result[i-1]++;
               } else if(result[i+1] == -1) {
                   result[i]--;
                   result[i+1]++;
               }
           }
        }

        for(int i=1; i<=n; i++) {
            if(result[i] >= 0) answer++;
        }

        return answer;
    }
}
