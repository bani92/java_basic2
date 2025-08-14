package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class 영단어암기는괴로워 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); // 최소 길이 M

        HashMap<String, Integer> map = new HashMap<>();

        // 1. 단어를 입력받으면서 M 미만인 단어는 무시하고, 빈도수 계산
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) {
                continue; // 길이가 M 미만이면 건너뜀
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 2. HashMap의 내용을 List로 옮김
        List<String> words = new ArrayList<>(map.keySet());

        // 3. 문제의 3가지 조건에 맞춰 정렬
        words.sort((w1, w2) -> {
            int freq1 = map.get(w1);
            int freq2 = map.get(w2);

            // 1순위: 빈도수 내림차순
            if (freq1 != freq2) {
                return freq2 - freq1;
            }

            // 2순위: 단어 길이 내림차순
            if (w1.length() != w2.length()) {
                return w2.length() - w1.length();
            }

            // 3순위: 알파벳 오름차순
            return w1.compareTo(w2);
        });

        // 4. 정렬된 결과를 StringBuilder를 이용해 출력
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append('\n');
        }
        System.out.print(sb);
    }
}
