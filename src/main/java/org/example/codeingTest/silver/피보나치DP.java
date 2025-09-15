package org.example.codeingTest.silver;

public class 피보나치DP {
    static int[] f;
    public static void main(String[] args) {
        int n = 10;
        f = new int[n+1];
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(f[n] != 0) {
            return f[n];
        } else {
            if(n == 1 || n == 2) {
                f[n] = 1;
            } else {
                f[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
            return f[n];
        }

    }
}
