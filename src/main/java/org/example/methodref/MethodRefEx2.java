package org.example.methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {

    public static void main(String[] args) {
        // 정적 메서드 참고
        Function<String, String> staticMethod = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName; // 클래스::정적메서드
        System.out.println(staticMethod.apply("정적 메서드"));
        System.out.println(staticMethod2.apply("인스턴스 메서드"));

        // 특정 객체 인스턴스 참조
        Person person = new Person("Kim");
        Function<Integer, String> instanceMethod1 = number -> person.introduceWithNumber(number);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber; // 객체::인스턴스메서드
        System.out.println("instanceMethod1 = " + instanceMethod1.apply(5));
        System.out.println("instanceMethod2 = " + instanceMethod2.apply(5));

        // 생성자 참조
        Function<String, Person> newPerson1 = (name) -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;
        System.out.println("newPerson1 = " + newPerson1.apply("홍길동").getName());
        System.out.println("newPerson2 = " + newPerson2.apply("김길동").getName());
    }
}
