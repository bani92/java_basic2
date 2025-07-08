package org.example.codeingTest;

import java.util.ArrayList;
import java.util.List;

public class 프린터_2 {
    public int solution(int[] priorities, int location) {

        // 1. Queue 만들기
        List<Integer> printer = new ArrayList<>();
        for(int priority : priorities) {
            printer.add(priority);
        }
        int turn = 0;
        // 2. 0번을 꺼내서 max 우선순위가 아니면 다시 끝에 넣는다
        while(!printer.isEmpty()) {
            Integer priority = printer.remove(0);
            if(printer.stream().anyMatch(other -> priority < other)) {
                printer.add(priority);
            } else {
                // 3. max 우선순위이면 내가 찾는 job이 맞는지 확인한다.
                turn++;
                if (location == 0) break;
            }

            location--;
            if(location < 0) location = printer.size() - 1;
        }

        return turn;
    }

    public static void main(String[] args) {
        프린터_2 sol = new 프린터_2();
        int[] prioritites = {2, 1, 3, 2};
        System.out.println(sol.solution(prioritites, 2));
    }
}
