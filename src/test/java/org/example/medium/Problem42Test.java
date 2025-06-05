package org.example.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem42Test {

    @Test
    void sumSpecialMultiples() {
        assertEquals(63, Problem42.sumSpecialMultiples(Arrays.asList(3, 5, 10, 15)));
    }

    @Test
    void filterStringsByLength() {
        assertEquals(Arrays.asList("cat", "dog"), Problem42.filterStringsByLength(Arrays.asList("cat", "sheep", "dog"), Arrays.asList(3, 3, 3)));
    }

    @Test
    void sumExcludingRange() {
        assertEquals(30, Problem42.sumExcludingRange(Arrays.asList(3, 5, 7, 10, 12, 15)));
    }

    @Test
    void concatenateStringsOverLengthThree() {
        assertEquals("applebanana", Problem42.concatenateStringsOverLengthThree(Arrays.asList("apple", "ban", "banana")));
    }
}