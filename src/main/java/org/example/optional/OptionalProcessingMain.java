package org.example.optional;

import java.util.Optional;

public class OptionalProcessingMain {

    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // 값이 존재하면 Consumer 실행, 없으면 아무 일도 하지않음
        optValue.ifPresent(v -> System.out.println("optValue = 값 " + v));
        optEmpty.ifPresent(v -> System.out.println("optValue = 값 " + v));

        // 값이 있으면 Consumer 실행, 없으면 Runnable 실행
        System.out.println("=== 2. ifPresentOrElse() ===");
        optValue.ifPresentOrElse(v -> System.out.println("optValue = 값 " + v), () -> System.out.println("optValue 비어있음"));
        optEmpty.ifPresentOrElse(v -> System.out.println("optValue = 값 " + v), () -> System.out.println("optValue 비어있음"));

        // 값이 있으면 Function 적용 후 Optional로 반환, 없으면 Optional.empty()
        System.out.println("=== 3. map() ===");
        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1.get());
        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);

        // map()과 유사하나 이미 Optional을 반환하는 경우 중첩을 제거
        System.out.println("=== 4. flatMap() ===");
        Optional<Optional<Integer>> nestedOpt = optValue.map(s -> Optional.of(s.length()));
        System.out.println("nestedOpt = " + nestedOpt);

        Optional<Integer> flattenedOpt = optValue.flatMap(s -> Optional.of(s.length()));
        System.out.println("flattenedOpt = " + flattenedOpt);

        // 값이 있고 조건을 만족하면 그 값을 그대로 ,불만족시 Optional.empty()
        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        Optional<String> filtered2 = optValue.filter(s -> s.startsWith("X"));

        System.out.println("filtered(H) = " + filtered1);
        System.out.println("filtered(X) = " + filtered2);

        System.out.println("=== 6. stream() ===");
        // 값이 있으면 단일 요소 스트림, 없으면 빈 스트림
        optValue.stream()
                .forEach(s -> System.out.println("optValue.stream() = " + s));

        // 값이 없으므로 실행 안됨
        optEmpty.stream()
                .forEach(s -> System.out.println("optValue.stream() = " + s));
    }
}
