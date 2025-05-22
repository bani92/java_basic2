package org.example.lambda.lambda1;

import org.example.lambda.MyFunction;
import org.example.lambda.Procedure;

public class LambdaSimple3 {

    public static void main(String[] args) {

        // 타입 생략 전
        MyFunction myFunction = (int a , int b) -> a + b;

        // 타입 생략 후 MyFunction 타입을 통해 타입 추론 가능
        MyFunction myFunction1 = (a , b) -> a + b;

        // 기본
        MyCall call = (int value) -> value * 2;

        // 괄호(매개변수가 하나일때) () 생략가능
        // 타입 생략
        MyCall call1 = value -> value * 2;
    }

    interface MyCall {
        int call(int value);
    }
}
