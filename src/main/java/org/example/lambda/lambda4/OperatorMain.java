package org.example.lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {

    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;
        UnaryOperator<Integer> square2 = x -> x * x;
        System.out.println("square = " + square.apply(3));
        System.out.println("square2 = " + square2.apply(3));

        BiFunction<Integer, Integer, Integer> addition = (x , y) -> x + y;
        BinaryOperator<Integer> addition2 = (x , y) -> x + y;

        System.out.println(addition.apply(1, 2));
        System.out.println(addition2.apply(1, 2));
    }
}
