package org.example.stream.operation;

import java.util.Optional;

public class OptionalSimpleMain {

    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(10);
        System.out.println("opt = " + opt);

        if(opt.isPresent()) {
            System.out.println("opt = " + opt.get());
        }

        Optional<Object> opt2 = Optional.ofNullable(null);
        System.out.println("opt2 = " + opt2);
        if(opt2.isPresent()) {
            Object o = opt2.get();
            System.out.println("o = " + o);
        }

        // 값이 없는 Optional에서 get()을 호출하면 NoSuchElementException 발생
        Object o2 = opt2.get();
        System.out.println("o2 = " + o2);
    }
}
