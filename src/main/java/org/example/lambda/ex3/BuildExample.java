package org.example.lambda.ex3;

import org.example.lambda.ex2.StringFunction;

public class BuildExample {

    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        return name -> greeting + " " + name;
    };
    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("Hello");
        StringFunction hiGreeter = buildGreeter("Hi");
        System.out.println(helloGreeter.apply("World"));
        System.out.println(helloGreeter.apply("Lambda"));
    }
}
