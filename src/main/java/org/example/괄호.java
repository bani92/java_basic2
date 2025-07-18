package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            Stack<Character> stack = new Stack<>();
            String result = "YES";
            String str = br.readLine();

            // str의 괄호를 하나씩 스택에 담기
            // 왼쪽 괄호는 push
            // 오른쪽 괄호 들어올시 스택 pop

            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);
                if(c == '(') {
                    stack.push(c);
                } else {

                    if(stack.isEmpty()) {
                        result = "NO";
                        break;
                    }

                    if(stack.peek() == '(') {
                        stack.pop();
                    }
                }
            }

            if(!stack.isEmpty()) {
                result = "NO";
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
