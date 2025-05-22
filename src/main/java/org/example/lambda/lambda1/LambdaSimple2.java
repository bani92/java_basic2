package org.example.lambda.lambda1;

import org.example.lambda.MyFunction;
import org.example.lambda.Procedure;

public class LambdaSimple2 {

    public static void main(String[] args) {

        Procedure procedure1 = () -> {
            System.out.println("Hello Lambda");
        };
        procedure1.run();

        // 단일 표현식은 중괄호 생략 가능
        Procedure procedure2 = () -> System.out.println("Hello Lambda2");
        procedure2.run();
    }
}
