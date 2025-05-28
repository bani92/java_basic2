package org.example.stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class InterOperationMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 5, 6, 7, 8, 8);

        System.out.println("1. filter");
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("2. map");
        list.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("3. distinct");
        list.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("4. sorted");
        Stream.of(3,1,2,7,4)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("5. sorted(커스텀)");
        Stream.of(3,1,2,7,4)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("6. peek(확인용)");
        list.stream()
                .peek(n -> System.out.print("before: "  + n + ", "))
                .map(n -> n * n)
                .peek(n -> System.out.print("after: "  + n + ", "))
                .limit(5)
                .forEach(n -> System.out.print("최종값: " + n + " \n"));
        System.out.println("\n");

        System.out.println("8. skip - 처음 5개 요소 건너뛰기");
        list.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        // 9. takeWhile (Java 9+)
        System.out.println("9. takeWhile - 5보다 작은 동안만 선택");
        numbers2.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 10. dropWhile (Java 9+)
        System.out.println("10. dropWhile - 5보다 작은 동안 건너뛰기");
        numbers2.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");
    }
}
