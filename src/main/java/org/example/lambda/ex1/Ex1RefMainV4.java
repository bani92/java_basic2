package org.example.lambda.ex1;

import org.example.lambda.Procedure;

import java.util.Random;

// 익명 클래스 사용
public class Ex1RefMainV4 {

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {

        hello(() -> {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            });
        
        hello(() -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            });
    }

    // 클래스 내부에 함수를 정의 - 메서드
    // 클래스와 상관없이 독립적으로 호출 가능한 단위 - 함수
}