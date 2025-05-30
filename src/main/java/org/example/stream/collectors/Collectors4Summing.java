package org.example.stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4Summing {

    public static void main(String[] args) {
        Long count1 = Stream.of(1, 2, 3)
                .collect(Collectors.counting());

        System.out.println("count1 = " + count1);

        Long count2 = Stream.of(1, 2, 3)
                .count();

        System.out.println("count2 = " + count2);

        Double average = Stream.of(1, 2, 3)
                .collect(Collectors.averagingInt(i -> i));

        System.out.println("average = " + average);

        // 기본형 특화 스트림으로 변화
        double average2 = Stream.of(1, 2, 3).mapToInt(i -> i).average().getAsDouble();
        System.out.println("average2 = " + average2);

        // 기본형 특화
        double average3 = IntStream.of(1, 2, 3)
                .average().getAsDouble();
        System.out.println("average3 = " + average3);

        // 통계
        IntSummaryStatistics stats = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.summarizingInt(String::length));

        System.out.println("getSum = " + stats.getSum());
        System.out.println("getCount = " + stats.getCount());
        System.out.println("getMax = " + stats.getMax());
        System.out.println("getMin = " + stats.getMin());


    }
}
