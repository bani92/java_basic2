package org.example.medium;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Problem40Test {

    @Test
    public void Problem40Test() {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "grape");

        Map<Integer, List<String>> integerListMap = Problem40.groupStringsByLength(strings);
        System.out.println(integerListMap);
    }

    @Test
    public void Problem41Test() {
        List<String> strings = Arrays.asList("cat", "car", "apple", "banana");
        AbstractMap.SimpleEntry<Long, Double> longDoubleSimpleEntry = Problem40.countAndAverageLengthOfStringsStartingWithC(strings);
        System.out.println(longDoubleSimpleEntry);
    }

}