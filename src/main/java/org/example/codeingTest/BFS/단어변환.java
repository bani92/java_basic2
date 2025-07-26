package org.example.codeingTest.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {

    boolean[] visited;
    public static void main(String[] args) {

        단어변환 solver = new 단어변환();
        String[] str = {"hot", "dot", "dog", "lot", "log"};
        System.out.println(solver.solution("hit","cog",str));
    }

    public int solution(String begin, String target, String[] words) {

        this.visited = new boolean[words.length];


        return bfs(begin,target,words);
    }

    static class Node {
        String word;
        int count;

        public Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    public int bfs(String begin, String target, String[] words) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            String word = node.word; // 큐에서 단어를 꺼낸다
            int count = node.count;

            if(target.equals(word)) {
                return count;
            }

            for(int i=0; i<words.length; i++) {
                if(!visited[i]) {
                    if(isOneCharDiff(words[i], word)) {
                        visited[i] = true;
                        queue.add(new Node(words[i], count + 1));
                    }
                }
            }
        }
        return 0;
    }

    public boolean isOneCharDiff(String word1, String word2) {

        // 글자 크기를 비교한다
        if(word1.length() != word2.length()) {
            return false;
        }
        // 글자가 다른 갯수를 비교한다.
        int diffCount = 0;

        for(int i=0 ; i<word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
            // 2개 이상이면 false
            if(diffCount > 1) {
                return false;
            }
        }
        return diffCount == 1;
    }
}
