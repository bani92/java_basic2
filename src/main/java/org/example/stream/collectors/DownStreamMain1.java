package org.example.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Han", 2, 90),
                new Student("Hoon", 3, 90),
                new Student("Ha", 3, 89)
        );

        // 1단계 : 학년별로 학생들을 그룹화 해라.
        Map<Integer, List<Student>> group1 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade, // 그룹화 기준 : 학년
                        Collectors.toList())); // 다운스트림 : 학생을 리스트로 수집

        System.out.println("group1 = " + group1);

        // 다운스트림에서 toList() 생략가능
        Map<Integer, List<Student>> group2 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade // 그룹화 기준 : 학년
                       ));

        System.out.println("group2 = " + group2);

        // 2단계 : 학년별로 학생들의 이름을 출력해라
        Map<Integer, List<String>> group3 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade, // 그룹화 기준 : 학년
                        Collectors.mapping(Student::getName // 다운스트림1 : 학생 -> 이름 변환
                                , Collectors.toList()) // 다운스트림2 : 변환된 값(이름)을 List로 수집
                ));
        System.out.println("group3 = " + group3);

        // 3단계 : 학년별로 학생들의 수를 출력해라
        Map<Integer, Long> group4 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade,
                        Collectors.counting()
                ));
        System.out.println("group4 = " + group4);

        // 4단계 : 학년별로 학생들의 평균을 출력해라
        Map<Integer, Double> average = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade,
                        Collectors.averagingInt(Student::getScore)
                ));

        System.out.println("average = " + average);
    }
}
