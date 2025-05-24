package org.example.lambda.ex3;

import org.example.lambda.ex2.MyPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExampleEx2 {

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        // 1. 음수만 뽑아내기
        // 코드
        List<Integer> filter = filter(numbers,value -> value < 0);
        System.out.println("음수만 : " + Arrays.toString(filter.toArray()));

        List<Integer> filter1 = filter(numbers, value -> value % 2 == 0);
        System.out.println("짝수만 : " + Arrays.toString(filter1.toArray()));
        // 2. 짝수만 뽑아내기
        // 코드
    }
}
