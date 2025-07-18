package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = "";
            int pushNum = 0;
            if(st.countTokens() == 2) {
                str = st.nextToken();
                pushNum = Integer.parseInt(st.nextToken());
                stack.push(pushNum);
            } else {
                str = st.nextToken();
            }

            if("top".equals(str)) {
                if(stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if("size".equals(str)) {
                System.out.println(stack.size());
            } else if("empty".equals(str)) {
                System.out.println(stack.empty() ? 1 : 0);
            } else if("pop".equals(str)) {
                if(stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
        }

    }
}
