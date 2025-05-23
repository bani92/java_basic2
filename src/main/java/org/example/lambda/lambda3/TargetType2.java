package org.example.lambda.lambda3;

import java.util.function.Function;

// 자바가 기본으로 제공하는 펑션 사용
public class TargetType2 {

    public static void main(String[] args) {
        Function<String,String> upperCase = s -> s.toUpperCase();
        String hello = upperCase.apply("hello");
        System.out.println("hello = " + hello);

        Function<Integer, Integer> square = n -> n * n;
        Integer result = square.apply(5);
        System.out.println("result = " + result);
        
        // 람다 직접 대입
        Function<Integer , String> functionA = i -> "value = " + i;
        System.out.println("functionA.apply(10) = " + functionA.apply(10));

        Function<Integer, String> functionB = functionA;
        System.out.println("functionB.apply(10) = " + functionB.apply(20));
    }
}
