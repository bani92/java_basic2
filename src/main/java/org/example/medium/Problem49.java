package org.example.medium;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem49 {

    // 49 50 51
    /**
     * 주어진 문자열 리스트에서 각 문자열의 첫 글자를 대문자로 변환하고,
     * 나머지 글자는 소문자로 변환한 새로운 리스트를 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 변환된 문자열 리스트
     */
    public static List<String> capitalizeFirstLetter(List<String> strings) {
        // 여기에 코드 작성
        return  strings.stream().map(str -> str.toUpperCase().charAt(0) + str.substring(1).toLowerCase()).collect(Collectors.toList());
    }

    /**
     * 주어진 정수 리스트에서 합이 10을 초과하는 최초의 연속된 부분 리스트를 반환합니다.
     * 예를 들어, [1, 2, 3, 5, 4]의 경우 [3, 5, 4]가 해당합니다.
     *
     * @param numbers 정수 리스트
     * @return 합이 10을 초과하는 최초의 연속된 부분 리스트
     */
    public static List<Integer> findFirstSublistWithSumOverTen(List<Integer> numbers) {
        // 여기에 코드 작성
        return IntStream.range(0, numbers.size())
                .boxed()
                .flatMap(start -> IntStream.rangeClosed(start + 1, numbers.size())
                        .mapToObj(end -> numbers.subList(start, end)))
                .filter(sublist -> sublist.stream().mapToInt(Integer::intValue).sum() > 10)
                .findFirst()
                .orElse(Collections.emptyList());
    }

    /**
     * 주어진 직원(Employee) 리스트에서 'IT' 부서에 속하고,
     * 나이가 30 이상인 직원들의 이름을 알파벳 순으로 정렬하여 반환합니다.
     *
     * @param employees 직원 리스트
     * @return 조건을 만족하는 직원들의 이름 리스트
     */
    public static List<String> getNamesOfITDepartmentEmployeesOver30(List<Employee> employees) {
        // 여기에 코드 작성
        return employees.stream().filter(emp -> "IT".equals(emp.getDepartment()) && emp.getAge() >= 30).map(Employee::getName).sorted().toList();
    }
}
