package org.example.methodref;

import org.example.lambda.lambda5.myStream.MyStreamV2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRef5 {

    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Kim"),
                new Person("Park"),
                new Person("Lee"));


        List<String> result1 = MyStreamV2.of(personList)
                .map(person -> person.introudce())
                .map(str -> str.toUpperCase())
                .toList();

        System.out.println("result1 = " + result1);

        List<String> result2 = MyStreamV2.of(personList)
                .map(Person::introudce)
                .map(String::toUpperCase)
                .toList();

        System.out.println("result2 = " + result2);


    }




}
