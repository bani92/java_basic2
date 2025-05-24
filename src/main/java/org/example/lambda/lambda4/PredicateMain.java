package org.example.lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };
        System.out.println("predicate.test(10) = " + predicate.test(10));

        // 의도를 명시적으로 드러내기 위해 정의된 함수형 인터페이스
        Predicate<Integer> predicate1 = value -> value % 2 != 0;
        System.out.println("predicate1.test(5) = " + predicate1.test(5));

        Function<Integer, Boolean> function = value -> value % 2 == 0;
        System.out.println("function.apply(10) = " + function.apply(10));

    }
}
