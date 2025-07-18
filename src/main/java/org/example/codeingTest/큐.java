package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int lastNum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = -1;

            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());

            }

            switch (str) {
                case "push" : queue.add(num);  lastNum = num; break;
                case "pop" : bw.write((queue.isEmpty() ? -1 : queue.poll()) + "\n"); break;
                case "size" : bw.write(queue.size() + "\n"); break;
                case "empty" : bw.write((queue.isEmpty() ? 1 : 0) + "\n"); break;
                case "front" : bw.write((queue.isEmpty() ? -1 : queue.peek()) + "\n"); break;
                case "back" : bw.write((queue.isEmpty() ? -1 : lastNum) + "\n"); break;
                default: break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
