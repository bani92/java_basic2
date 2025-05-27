package org.example.stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class ImmutableMain {

    public static void main(String[] args) {
        // 불변
        List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println("originList = " + originList);

        List<Integer> filteredList = originList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("filteredList = " + filteredList);

        // 스트림 중복 실행
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);
        // stream.forEach(System.out::println); 오류

    }
}
