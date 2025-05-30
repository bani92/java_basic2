package org.example.lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        // 익명 클래스
        Supplier<Integer> supplier = new Supplier<>() {
            @Override
            public Integer get() {
                return new Random().nextInt(10);
            }
        };
        System.out.println("supplier.get() = " + supplier.get());

        // 람다
        Supplier<Integer> supplier1 = () -> new Random().nextInt(10);
        System.out.println("supplier1 = " + supplier1.get());
    }
}
