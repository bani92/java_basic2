package org.example.methodref;

import java.util.function.Function;

public class MethodRef3 {

    public static void main(String[] args) {
        // 임의 객체의 인스턴스 메서드 참조
        Person person1 = new Person("Kim");
        Person person2 = new Person("Park");
        Person person3 = new Person("Lee");

        Function<Person, String> fun1 = (Person person) -> person.introudce();
        System.out.println("fun1 = " + fun1.apply(person1));
        System.out.println("fun2 = " + fun1.apply(person2));
        System.out.println("fun3 = " + fun1.apply(person3));
        System.out.println("---------------------------------");
        // 메서드 참조, 타입이 첫번째 매개변수가 됨
        // 그리고 첫번째 매개변수의 메서드를 호출, 나머지는 순서대로 매개변수에 전달
        Function<Person, String> fun2 = Person::introudce; // 타입::인스턴스메서드
        System.out.println("fun1 = " + fun2.apply(person1));
        System.out.println("fun2 = " + fun2.apply(person2));
        System.out.println("fun3 = " + fun2.apply(person3));
    }
}
