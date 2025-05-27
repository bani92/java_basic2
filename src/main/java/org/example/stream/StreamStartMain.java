package org.example.stream;

import java.util.List;

public class StreamStartMain {

    public static void main(String[] args) {
        List<String> names = List.of("Apple","Banana","Berry","Tomato");

        List<String> list = names.stream().filter(name -> name.startsWith("B")).map(String::toUpperCase).toList();
        System.out.println("list = " + list);

        names.stream().filter(name -> name.startsWith("B")).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("---메서드 참조---");
    }
}
