package org.example.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors3Group  {

    public static void main(String[] args) {
        // 첫글자로 그룹화
        List<String> names = List.of("Apple", "Avocado", "Banana", "Blueberry", "Cherry");
        Map<String, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0, 1)));
        // {A=[Apple, Avocado], B=[Banana, Blueberry], C=[Cherry]}
        System.out.println("grouped = " + grouped);

        // 짝수(even)인지 여부로 분할(파티셔닝)
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> paritioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        // {false=[1, 3, 5], true=[2, 4, 6]}
        System.out.println("paritioned = " + paritioned);


    }
}
