package org.example.stream.operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TermialOperationMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("1. collect - List 수집");
        List<Integer> evenNumber1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("evenNumber1 = " + evenNumber1);
        System.out.println();

        System.out.println("2. toList - (Java 16+) 수집");
        List<Integer> evenNumber2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("evenNumber2 = " + evenNumber2);
        System.out.println();

        System.out.println("3. toArray - 배열로 변환");
        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println();

        System.out.println("4. forEach - 각 요소처리");
                numbers.stream()
                    .limit(5)
                    .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println("5. count");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println("count = " + count);
        System.out.println();

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기값이 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("sum1 = " + sum1.get());

        System.out.println();
        System.out.println("초기값이 있는 reduce");
        Integer sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("sum2(초기값100) = " + sum2);

        System.out.println();
        System.out.println("7. min");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
                // .min((a, b) -> a.compareTo(b));

        System.out.println("min = " + min.get());
        System.out.println();

        System.out.println("9. findFirst");
        Optional<Integer> first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst();

        System.out.println("first = " + first.get());
        System.out.println();

        System.out.println("10. findAny - 아무 요소나 하나 찾기");
        Optional<Integer> firstAny = numbers.stream()
                .filter(n -> n > 5)
                .findAny();

        System.out.println("firstAny = " + firstAny.get());
        System.out.println();

        System.out.println("11. anyMatch - 조건을 만족하는 존재 여부");
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("hasEven = " + hasEven);
        System.out.println();

        System.out.println("12. allMatch - 모든 요소가 조건에 만족하는지");
        boolean allPostive = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println("allPostive = " + allPostive);
        System.out.println();

        System.out.println("12. noneMatch - 조건을 만족하는 요소가 없는지");
        boolean noNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("noNegative = " + noNegative);

    }
}
