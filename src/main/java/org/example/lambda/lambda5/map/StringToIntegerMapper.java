package org.example.lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringToIntegerMapper {

    public static List<Integer> mapNew(List<String> list , Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : list) {
            numbers.add(mapper.apply(s));
        }
        return numbers;
    }
}
