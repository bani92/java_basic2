package org.example.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {

    public static void main(String[] args) {
        // 숫자 사용 필터
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("evenNumbers1 = " + GenericFilter.filter(numbers, a -> a % 2 == 0));

        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        System.out.println("GenericFilter.filter(strings, a -> a.length() > 1) = " + GenericFilter.filter(strings, a -> a.length() > 1));
    }


}
