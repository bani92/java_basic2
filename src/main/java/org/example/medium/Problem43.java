package org.example.medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem43 {

    // 46, 47, 48
    /**
     * 주어진 정수 리스트에서 각 숫자의 출현 빈도를 계산하여 Map으로 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 각 숫자의 출현 빈도를 나타내는 Map
     */
    public static Map<Integer, Long> frequencyOfNumbers(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
    }

    /**
     * 주어진 문자열 리스트에서 'd'로 시작하는 문자열의 인덱스를 찾아 리스트로 반환합니다.
     * 인덱스는 0부터 시작합니다.
     *
     * @param strings 문자열 리스트
     * @return 'd'로 시작하는 문자열의 인덱스 리스트
     */
    public static List<Integer> findIndicesOfStringsStartingWithD(List<String> strings) {
        return  IntStream.range(0, strings.size())
                .boxed()
                .filter(i -> strings.get(i).startsWith("d"))
                .collect(Collectors.toList());
    }

    /**
     * 주어진 정수 리스트가 순차적으로 증가하는지 확인합니다.
     * 예를 들어, 리스트 [1, 2, 3, 4]는 순차적으로 증가하지만, [1, 3, 2, 4]는 그렇지 않습니다.
     *
     * @param numbers 정수 리스트
     * @return 리스트가 순차적으로 증가하면 true, 그렇지 않으면 false
     */
    public static boolean isSequentiallyIncreasing(List<Integer> numbers) {
        // 여기에 코드 작성
        return   IntStream.range(0, numbers.size() - 1)
                .boxed()
                .allMatch(i -> numbers.get(i) + 1 == numbers.get(i+1));
    }
}
