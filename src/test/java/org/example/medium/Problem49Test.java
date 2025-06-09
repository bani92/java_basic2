package org.example.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem49Test {

    @Test
    void capitalizeFirstLetter() {
        assertEquals(Arrays.asList("Apple", "Banana", "Cherry"), Problem49.capitalizeFirstLetter(Arrays.asList("apple", "banana", "cherry")));
    }

    @Test
    void findFirstSublistWithSumOverTen() {
        assertEquals(Arrays.asList(1, 2, 3, 5), Problem49.findFirstSublistWithSumOverTen(Arrays.asList(1, 2, 3, 5, 4)));
    }

    @Test
    public void testGetNamesOfITDepartmentEmployeesOver30() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 35, "IT"),
                new Employee("Bob", 25, "IT"),
                new Employee("Charlie", 32, "HR"),
                new Employee("David", 40, "IT")
        );

        List<String> expected = Arrays.asList("Alice", "David");
        assertEquals(expected, Problem49.getNamesOfITDepartmentEmployeesOver30(employees));
    }
}