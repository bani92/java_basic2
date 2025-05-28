package org.example.stream.operation;

import java.util.Arrays;
import java.util.List;

public class CreateStreamMain {

    public static void main(String[] args) {

        List<String> a = List.of("a", "b", "c");
        a.stream().forEach(System.out::println);

        String[] arr = {"a","b","c"};
        Arrays.stream(arr).forEach(System.out::println);


    }
}
