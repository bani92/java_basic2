package org.example.methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {

    public static void main(String[] args) {
        // 정적 메서드 참고
        Supplier<String> staticMethod = () -> Person.greeting();
        Supplier<String> staticMethod2 = Person::greeting; // 클래스::정적메서드
        System.out.println(staticMethod.get());
        System.out.println(staticMethod2.get());

        // 특정 객체 인스턴스 참조
        Person person = new Person("Kim");
        Supplier<String> instanceMethod1 = () -> person.introudce();
        Supplier<String> instanceMethod2 = person::introudce; // 객체::인스턴스메서드
        System.out.println("instanceMethod1 = " + instanceMethod1.get());
        System.out.println("instanceMethod2 = " + instanceMethod2.get());

        // 생성자 참조
        Supplier<Person> newPerson1 = () -> new Person();
        Supplier<Person> newPerson2 = Person::new;
        System.out.println("newPerson1 = " + newPerson1.get());
        System.out.println("newPerson2 = " + newPerson2.get());
    }
}
