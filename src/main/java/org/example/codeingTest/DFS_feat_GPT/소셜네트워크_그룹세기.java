package org.example.codeingTest.DFS_feat_GPT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 소셜네트워크_그룹세기 {

    static ArrayList<ArrayList<Integer>> graph; // 1. 친구 관계 지도
    static boolean[] visited; // 2.방문 기록지
    static int count = 0; // 3. 그룹 인원수
    public static void main(String[] args) throws Exception {

        /**
         * 1.사용자들의 친구 관계를 **그래프(연결 목록)**로 만든다.
         * 2.'방문했는지'를 기록할 visited 배열을 만든다.
         * 3.그룹 인원 수를 셀 count 변수를 하나 만든다.
         * 4.1번 사용자를 시작으로 DFS 함수를 호출한다.
         * 5.DFS 함수는 새로운 사용자를 방문할 때마다 count를 1씩 늘린다.
         * 6.탐색이 모두 끝나면 count를 출력한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 사용자 수
        int M = Integer.parseInt(st.nextToken()); // 관계 수

        graph = new ArrayList<>();
        visited = new boolean[N+1];

        for(int i=0; i<= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i =0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        System.out.println(graph);
        for(int i=0; i<graph.size(); i++) {
            System.out.println(graph.get(i));
        }

        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int user) {
        // 1. 현재 사용자를 '방문했다'고 도장 쾅
        visited[user] = true;

        // 2. 그룹 인원 수 1 증가!
        count++;

        // 3. 현재 사용자의 모든 친구를 확인
        for (int friend : graph.get(user)) {
            // 4. 만약 그 친구를 아직 방문 안했다면
            if (!visited[friend]) {
                // 5. 그 친구에게로 탐색을 떠난다! (재귀호출)
                dfs(friend);
            }
        }
    }
}
