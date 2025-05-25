package org.example.lambda.lambda5.myStream;


import org.example.lambda.lambda5.filter.GenericFilter;
import org.example.lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);

        List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<Integer> lambda(List<Integer> numbers) {

        List<Integer> filter = GenericFilter.filter(numbers, num -> num % 2 == 0);
        return  GenericMapper.map(filter, num -> num * 2);
    }

    private static List<Integer> direct(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        for (Integer number : numbers) {
            if(number % 2 == 0) {
                list.add(number * 2);
            }
        }

        return list;
    }
}