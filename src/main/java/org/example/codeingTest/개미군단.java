package org.example.codeingTest;

public class 개미군단 {
    public static void main(String[] args) {
        System.out.println(Solution(23));
    }

    public static int Solution(int hp) {
        int answer = 0;

        int[] arr = {5,3,1};
        for(int i=0; i<3; i++) {

            answer += hp / arr[i];
            if(hp % arr[i] == 0) {
                break;
            }
            hp = hp % arr[i];
        }

        return answer;

    }
}
