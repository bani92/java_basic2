package org.example.stream.operation;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {

    public static void main(String[] args) {
        // 기본형 특화 스트림(Int, Long, DoubleStream)
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 범위 생성 메서드
        IntStream range1 = IntStream.range(1, 6);
        IntStream range2 = IntStream.rangeClosed(1, 5);
        range1.forEach(i -> System.out.print(i + " "));
        System.out.println();
        range2.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 통계 관련 메서드
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        double avg = IntStream.range(1, 6).average().getAsDouble();
        System.out.println("avg = " + avg);

        IntSummaryStatistics status = IntStream.range(1, 6).summaryStatistics();
        System.out.println("합계 : " + status.getSum());
        System.out.println("평균 : " + status.getAverage());
        System.out.println("최대값 : " + status.getMax());
        System.out.println("최소값 : " + status.getMin());
        System.out.println("갯수 : " + status.getCount());

        // 타입 변환 메서드
        // Int -> Long Stream
        LongStream longStream = IntStream.range(1, 5).asLongStream();

        // Long -> Double Stream
        DoubleStream doubleStream = LongStream.range(1, 5).asDoubleStream();

        // Int -> Stream<Integer>
        Stream<Integer> boxed = IntStream.range(1, 5).boxed();

        // 3. 기본형 특화 매핑
        // int -> long 변환 매핑
        LongStream mappedLong = IntStream.range(1, 5).mapToLong(n -> n * 10L);
        mappedLong.forEach(n -> System.out.print(n + " "));

        // int -> double
        DoubleStream mappedToDouble = IntStream.range(1, 5).mapToDouble(n -> n * 1.5);
        mappedToDouble.forEach(n -> System.out.print(n + " "));

        // int -> 객체 변환 매핑
        Stream<String> mappedToObj = IntStream.range(1, 5)
                .mapToObj(i -> "Number: " + i);
        System.out.println();

        // 객체 스트림 -> 기본형 특화 스트림 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream1 = integerStream.mapToInt(i -> i);
        int sum1 = intStream1.sum();
        System.out.println("sum1 = " + sum1);

    }
}
