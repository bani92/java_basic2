package org.example.lambda.lambda3;

public class GenericMain2 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase =  s -> s.toUpperCase();
        String result = upperCase.apply("hello");
        System.out.println("result = " + result);

        GenericFunction<Integer, Integer> square = n -> n * n;
        Integer result2 = square.apply(5);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface GenericFunction<T,R> {
        R apply(T s);
    }


}
