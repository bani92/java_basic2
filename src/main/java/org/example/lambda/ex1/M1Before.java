package org.example.lambda.ex1;

public class M1Before {

    public static void greet(String str) {
        System.out.println("=== 시작 ===");
        System.out.println(str);
        System.out.println("=== 끝 ===");
    }
//    public static void greetMorning() {
//        System.out.println("=== 시작 ===");
//        System.out.println("Good Morning!");
//        System.out.println("=== 끝 ===");
//    }
//
//    public static void greetAfternoon() {
//        System.out.println("=== 시작 ===");
//        System.out.println("Good Afternoon!");
//        System.out.println("=== 끝 ===");
//    }
//
//    public static void greetEvening() {
//        System.out.println("=== 시작 ===");
//        System.out.println("Good Evening!");
//        System.out.println("=== 끝 ===");
//    }

    public static void main(String[] args) {
        greet("Good Morning!");
        greet("Good Afternoon!");
        greet("Good Evening!");
    }
}