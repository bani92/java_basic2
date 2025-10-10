package org.example.codeingTest.promgrammers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {
    static boolean[] visited;
    static String target;
    static String[] words;
    public static void main(String[] args) {

        String begin = "hit";
        target = "cog";
        words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
        visited = new boolean[words.length];

        System.out.println(bfs(begin));
    }

    private static int bfs(String begin) {

        if(!Arrays.asList(words).contains(target)) {
            return 0;
        }
        Queue<String[]> queue = new LinkedList<>();
        queue.add(new String[]{begin, "0"});

        while(!queue.isEmpty()) {
            String[] currentState  = queue.poll();
            String currentWord = currentState[0];
            int count = Integer.parseInt(currentState[1]);

            if(currentWord.equals(target)) {
                return count;
            }

            for(int i=0; i<words.length; i++) {
                if(!visited[i] && isConvertible(currentWord, words[i]) ) {
                    visited[i] = true;
                    queue.add(new String[]{words[i], String.valueOf(count + 1)});
                }
            }

        }
        return 0;
    }

    private static boolean isConvertible(String word1, String word2) {
        int diffCount = 0;
        for (int i=0; i<word1.length(); i++) {
            if(word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
}
