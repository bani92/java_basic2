package org.example.lambda.ex1;

import org.example.lambda.Procedure;

import java.util.Arrays;

public class M3MeasureTime {

    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                int x = 0;
                for(int i = 1; i<=100 ; i++) {
                  x += i;
                }
                System.out.println("[1부터 100까지의 합] 결과 : " + x);
            }

        };

        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                int[] arr = new int[]{4,3,2,1};
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            }
        };
        measure(procedure);
        measure(procedure1);
    }
    public static void measure(Procedure p) {
        long startTime = System.nanoTime();
        p.run();
        long endTime = System.nanoTime();

        System.out.println("실행 시간: " + (endTime - startTime) + "ns");
        System.out.println();
    }
}
