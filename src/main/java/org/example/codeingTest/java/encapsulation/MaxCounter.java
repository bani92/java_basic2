package org.example.codeingTest.java.encapsulation;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {

        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    private boolean isMax(int count) {
        return count >= max;
    }

    public int getCount() {
        return this.count;
    }
}
