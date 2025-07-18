package org.example.optional.logger;

import java.util.function.Function;
import java.util.function.Supplier;

public class LogMain3 {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(() -> value100() + value200());

        System.out.println("=== 디버그 모드 끄기 ===");
        logger.setDebug(false);
        logger.debug(() -> value100() + value200());
    }

    static int value100() {
        System.out.println("value100 호출");
        return 100;
    }

    static int value200() {
        System.out.println("value200 호출");
        return 200;
    }
}
