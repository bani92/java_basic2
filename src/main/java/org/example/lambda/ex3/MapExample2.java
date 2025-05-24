package org.example.lambda.ex3;

import org.example.lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapExample2 {

    public static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }


    public static void main(String[] args) {
        List<String> list = List.of("hello","java","lambda");

        System.out.println("원본 리스트: " + list);

        List<String> upperList = map(list, s1 -> s1.toUpperCase());
        System.out.println("대문자 변환 결과: " + upperList);

        List<String> decoList = map(list, s -> "****" + s + "****");
        System.out.println("특수문자 데코 결과: " + decoList);
    }
}
