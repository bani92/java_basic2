package org.example.codeingTest.bfs;

import java.util.*;

public class 여행경로 {

    static Map<String, PriorityQueue<String>> graph = new HashMap<>();
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        // graph 초기화
        for(String[] ticket : tickets) {
            graph.computeIfAbsent(ticket[0], k-> new PriorityQueue<>()).add(ticket[1]);
        }

        Stack<String> stack = new Stack<>();
        List<String> route = new LinkedList<>();

        stack.push("ICN");

        while(!stack.isEmpty()) {
            String current = stack.peek();

            if(!graph.containsKey(current) || graph.get(current).isEmpty()) {
                route.add(0, stack.pop());
            } else {
                stack.push(graph.get(current).poll());
            }
        }
        String[] answer;

        route.toArray();
        answer = route.toArray(new String[5]);
        System.out.println(Arrays.toString(answer));

        ArrayList<String> list = new ArrayList<>(List.of(answer));
        // System.out.println(Arrays.toString(route.toArray(new String[0])));

    }
}
