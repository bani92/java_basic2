package org.example.lambda.lambda1;

import org.example.lambda.MyFunction;

public class MyFunction1 {

    public static void main(String[] args) {

        MyFunction myFunction = (a, b) -> a + b;
        int result = myFunction.apply(1, 2);
        System.out.println(result);
    }
}
