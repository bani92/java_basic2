package org.example.lambda.lambda5.myStream;

import org.example.lambda.lambda5.filter.GenericFilter;
import org.example.lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex2_Student {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)

        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambda = lambda(students);
        System.out.println("lambda = " + lambda);
    }

    private static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();

        for(Student student : students) {
            if(student.getScore() >= 80) {
                result.add(student.getName());
            }
        }
        return result;
    }

    private static List<String> lambda(List<Student> students) {
        List<Student> filter = GenericFilter.filter(students, a -> a.getScore() >= 80);
        return GenericMapper.map(filter, s -> s.getName());
    }
}
