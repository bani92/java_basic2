package org.example.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T number : list) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
