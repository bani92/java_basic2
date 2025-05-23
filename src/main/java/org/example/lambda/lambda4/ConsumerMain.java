package org.example.lambda.lambda4;

import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {
        // 익명 클래스
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello consumer");

        // 람다
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("Hello consumer2");
    }
}
