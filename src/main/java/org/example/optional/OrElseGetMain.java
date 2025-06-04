package org.example.optional;

import java.util.Optional;
import java.util.Random;

public class OrElseGetMain {

    public static void main(String[] args) {
        Optional<Integer> optValue = Optional.of(100);
        Optional<Integer> optEmpty = Optional.empty();

        System.out.println("단순 계산");
        Integer i1 = optValue.orElse(10 + 20); // 계산 후 버림
        Integer i2 = optEmpty.orElse(10 + 20);// 계산 후 사용
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        // 값이 있으면 그 값, 없으면 지정된 기본값 사용
        System.out.println("=== orElse 즉시평가 ==="); // Optional에 값이 있어도 createData 즉시 호출되지만 값이 버려짐
        System.out.println("값이 있는 경우");
        Integer value1 = optValue.orElse(createData());
        System.out.println("value1 = " + value1);

        System.out.println("값이 없는 경우");
        Integer empty1 = optEmpty.orElse(createData());
        System.out.println("value2 = " + empty1);

        // 값이 있으면 그 값, 없으면 지정된 람다사용
        System.out.println("=== orElseGet 지연평가 ===");
        System.out.println("값이 있는 경우");
        Integer value2 = optValue.orElseGet(OrElseGetMain::createData);
        System.out.println("value1 = " + value2);

        System.out.println("값이 없는 경우");
        Integer empty2 = optEmpty.orElseGet(() -> createData());
        System.out.println("value2 = " + empty2);
    }

    static int createData() {
        System.out.println("데이터를 생성합니다...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int createValue = new Random().nextInt();
        System.out.println("데이터 생성이 완료되었습니다. 생성 값 : " + createValue);
        return createValue;
    }
}
