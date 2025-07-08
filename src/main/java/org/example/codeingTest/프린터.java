package org.example.codeingTest;

import java.util.ArrayList;
import java.util.List;

public class 프린터 {
    public int solution(int[] priorities, int location) {

        // 1. Queue 만들기
        List<PrintJob> printer = new ArrayList<>();
        for(int i=0; i< priorities.length; i++) {
            printer.add(new PrintJob(i, priorities[i]));
        }
        int turn = 0;
        while(!printer.isEmpty()) {
            // 2. 0번을 꺼내서 max 우선순위가 아니면 다시 끝에 넣는다
            PrintJob job = printer.remove(0);
            if(printer.stream().anyMatch(otherJob -> job.priority < otherJob.priority)) {
                printer.add(job); // 다시 재적재(맨 뒤로)
            } else {
                // 3. max 우선순위이면 내가 찾는 job이 맞는지 확인한다.
                turn++;
                if(location == job.location) break;
            }
        }

        return turn;
    }

    class PrintJob {
        int priority;
        int location;

        public PrintJob(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        프린터 sol = new 프린터();
        int[] prioritites = { 1, 1, 9, 1, 1, 1};
        System.out.println(sol.solution(prioritites, 0));
    }
}
