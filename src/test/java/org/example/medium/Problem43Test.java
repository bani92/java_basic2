package org.example.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Problem43Test {

    @Test
    void frequencyOfNumbers() {
        Map<Integer, Long> expected = Map.of(1, 2L, 2, 1L, 3, 1L, 4, 1L);
        assertEquals(expected, Problem43.frequencyOfNumbers(Arrays.asList(1, 1, 2, 3, 4)));
    }

    @Test
    void findIndicesOfStringsStartingWithD() {
        assertEquals(Arrays.asList(1, 3), Problem43.findIndicesOfStringsStartingWithD(Arrays.asList("apple", "dog", "cat", "door")));
    }

    @Test
    void isSequentiallyIncreasing() {
        assertTrue(Problem43.isSequentiallyIncreasing(Arrays.asList(1, 2, 3, 4)));
        assertFalse(Problem43.isSequentiallyIncreasing(Arrays.asList(1, 3, 2, 4)));
    }
}