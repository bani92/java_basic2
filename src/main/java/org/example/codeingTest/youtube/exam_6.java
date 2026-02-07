package org.example.codeingTest.youtube;

public class exam_6 {
    public static void main(String[] args) {
        // 최대공약수 구하기

        // 12 18

        int a = 30;
        int b = 15;

        int big = 0;
        int small = 0;

        int result = 0;
        if(a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        for(int i=1 ; i<= small; i++) {
            if(big % i == 0 && small % i == 0) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
