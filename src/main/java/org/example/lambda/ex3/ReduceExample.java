package org.example.lambda.ex3;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

    public static int  reduce(List<Integer> list, int initial, MyReducer reducer) {
        for (int i : list) {
            initial = reducer.reduce(initial, i);
        }
        return initial;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        int sum = reduce(list, 0, (a, b) -> a + b);
        int reduce = reduce(list, 1, (a, b) -> a * b);


    }
}
