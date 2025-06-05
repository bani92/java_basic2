package org.example.medium;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem42 {

    /**
     * 주어진 정수 리스트에서 3의 배수와 5의 배수를 찾아,
     * 이들 중 3의 배수는 그대로 두고, 5의 배수는 2배한 후 합산합니다.
     *
     * @param numbers 정수 리스트
     * @return 조건을 만족하는 숫자들의 합
     */


    public static int sumSpecialMultiples(List<Integer> numbers) {
        // 여기에 코드 작성

        Optional<Integer> reduce3 = numbers.stream().filter(num -> num % 3 == 0 || num % 5 == 0).
        map(i -> (i % 5) == 0 ? i * 2 : i).reduce(Integer::sum);

        return reduce3.orElse(0);
    }

    /**
     * 주어진 문자열 리스트와 정수 리스트를 결합하여,
     * 문자열의 길이가 해당 정수 이하인 문자열만 필터링하여 반환합니다.
     *
     * @param strings 문자열 리스트
     * @param lengths 정수 리스트 (각 문자열의 최대 길이를 나타냄)
     * @return 조건을 만족하는 문자열 리스트
     */
    public static List<String> filterStringsByLength(List<String> strings, List<Integer> lengths) {

        // IntStream은 0부터 N까지 시퀀스 생성 IntStream.range
        return IntStream.range(0, strings.size())
                .filter(i -> strings.get(i).length() <= lengths.get(i))
                .mapToObj(strings::get)
                .collect(Collectors.toList());
    }

    /**
     * 주어진 정수 리스트에서 5 이상 10 이하의 숫자를 제외하고 나머지 숫자들의 합을 계산합니다.
     *
     * @param numbers 정수 리스트
     * @return 5 이상 10 이하를 제외한 숫자들의 합
     */
    public static int sumExcludingRange(List<Integer> numbers) {
        // 5 6 7 8 9 10
        return numbers.stream().filter(i -> i < 5 || i > 10).reduce(Integer::sum).orElse(0);
    }

    /**
     * 주어진 문자열 리스트에서 길이가 4 이상인 문자열만을 선택하여,
     * 이들을 연결한 새로운 문자열을 생성합니다.
     *
     * @param strings 문자열 리스트
     * @return 선택된 문자열들을 연결한 새로운 문자열
     */
    public static String concatenateStringsOverLengthThree(List<String> strings) {
        // 여기에 코드 작성
        return strings.stream().filter(str -> str.length() >= 4).collect(Collectors.joining());
    }
}
