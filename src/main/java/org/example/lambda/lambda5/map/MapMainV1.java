package org.example.lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.example.lambda.lambda5.map.StringToIntegerMapper.mapNew;

public class MapMainV1 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);

        List<Integer> lengths = mapStringToLength(list);
        System.out.println("lengths = " + lengths);

        System.out.println(mapNew(list, s -> Integer.parseInt(s)));
        System.out.println(mapNew(list, s -> s.length()));

    }

    private static List<Integer> mapStringToInteger(List<String> list) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : list) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

    private static List<Integer> mapStringToLength(List<String> list) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : list) {
            numbers.add(s.length());
        }
        return numbers;
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> function) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : list) {
            numbers.add(function.apply(s));
        }
        return numbers;
    }
}
