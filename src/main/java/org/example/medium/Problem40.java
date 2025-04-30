package org.example.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem40 {

    /**
     * 주어진 문자열 리스트를 문자열 길이에 따라 분류하여 Map으로 반환합니다.
     * Map의 키는 문자열의 길이이며, 값은 해당 길이를 가진 문자열의 리스트입니다.
     *
     * @param strings 문자열 리스트
     * @return 문자열의 길이를 키로, 해당 길이의 문자열 리스트를 값으로 가지는 Map
     */
    public static Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        return strings.stream().collect(Collectors.groupingBy(String::length));
    }

    /**
     * 주어진 문자열 리스트에서 'c'로 시작하는 문자열의 개수와 이들 문자열의 평균 길이를 계산합니다.
     * 만약 'c'로 시작하는 문자열이 없으면 개수는 0, 평균 길이는 0.0을 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 'c'로 시작하는 문자열의 개수와 평균 길이를 포함하는 SimpleEntry (개수, 평균 길이)
     */
    public static AbstractMap.SimpleEntry<Long, Double> countAndAverageLengthOfStringsStartingWithC(List<String> strings) {
        // 여기에 코드 작성
        strings.stream().filter(word -> word.startsWith("c")).collect(Collectors.averagingDouble(String::length));
        return null;
    }
}
