package org.example.codeingTest.greedy;

import java.util.HashSet;

public class 체육복 {
    public static void main(String[] args) {

        int[] lost = {2,4};
        int[] reverse = {1,3,5};
        System.out.println(solution(5,lost,reverse));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer =0;
        HashSet<Integer> resSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for(int i : reserve) {
            resSet.add(i);
        }
        for(int i : lost) {
            if(resSet.contains(i)) {
                resSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }

        // 2. 여분의 기준으로 앞뒤로 확인하여 체육복을 빌려준다.
        for(int i : resSet) {
            if(lostSet.contains(i-1)) {
                lostSet.remove(i-1);
            } else if(lostSet.contains(i+1)) {
                lostSet.remove(i+1);
            }
        }

        // 3. 전체 학생 수에서 lostSet에 남은 학생수를 빼준다.
        answer = n - lostSet.size();



        return answer;
    }
}
