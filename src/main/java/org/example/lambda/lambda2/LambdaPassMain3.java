package org.example.lambda.lambda2;

import org.example.lambda.MyFunction;

public class LambdaPassMain3 {


    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        int result = add.apply(1, 2);
        System.out.println("result = " + result);

        MyFunction sub = getOperation("sub");
        int result1 = sub.apply(1, 2);
        System.out.println("result1 = " + result1);

        MyFunction x = getOperation("sub123");
        int result2 = x.apply(1, 2);
        System.out.println("result2 = " + result2);

    }

    // 람다를 반환하는 메서드
    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a,b) -> a + b;
            case "sub":
                return (a,b) -> a - b;
            default:
                return (a,b) -> 0;
        }
    }
}
