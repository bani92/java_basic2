package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int diff = 1;
        Stack<Integer> stack = new Stack<>();
        boolean possible = true;

        for(int i=1; i<=N; i++) {
            int a = Integer.parseInt(br.readLine());
            while(diff <= a) {
                stack.push(diff);
                sb.append("+").append("\n");
                diff++;
            }

            if (stack.peek() == a) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                possible = false;
                break;
            }
        }

        if(possible) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
