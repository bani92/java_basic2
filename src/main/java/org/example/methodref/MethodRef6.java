package org.example.methodref;

import org.example.lambda.lambda5.myStream.MyStreamV2;

import java.util.List;
import java.util.function.BiFunction;

public class MethodRef6 {

    public static void main(String[] args) {

        // 임의 객체의 인스턴스 메서드 참조
        Person person = new Person("Kim");

        // 람다
        BiFunction<Person, Integer, String> fun1 = (Person p , Integer number) -> p.introduceWithNumber(number);
        System.out.println(fun1.apply(person, 2));

        // 메서드 참조
        BiFunction<Person, Integer, String> fun2 = Person::introduceWithNumber;
        System.out.println("fun2 = " + fun2.apply(person, 3));
    }




}
