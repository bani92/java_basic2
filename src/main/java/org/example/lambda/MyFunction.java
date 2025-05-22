package org.example.lambda;

@FunctionalInterface
public interface MyFunction {
    int apply(int a, int b);
    // int minus(int a, int b); @FunctionalInterface 단일 추상 메서드의 함수형 인터페이스가 되어야한다.
}
