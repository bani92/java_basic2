package org.example.lambda.lambda5.myStream;

import java.util.List;

public class MyStreamV3Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        // 점수가 80점 이상인 학생을 추출
        List<String> result1 = ex1(students);
        System.out.println("result1 = " + result1);

        // 점수가 80점 이상
        // 이름이 5글자
        // 이름을 대문자로 추출
        List<String> result2 = ex2(students);
        System.out.println("result2 = " + result2);
    }



    private static List<String> ex1(List<Student> students) {
        return MyStreamV2.of(students).filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }

    private static List<String> ex2(List<Student> students) {
        return MyStreamV2.of(students)
                .filter(n -> n.getScore() >= 80)
                .filter(n -> n.getName().length() == 5)
                .map(n -> n.getName().toUpperCase())
                .toList();

    }
}
