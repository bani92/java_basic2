package org.example.codeingTest.bronze;

import java.util.HashMap;

public class 숫자문자열과_영단어 {
    public static void main(String[] args) {
        String s = "one4seveneightoneone";
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        for(int i=0; i<map.size(); i++) {
            if(s.contains(map.get(i))) {
                s = s.replaceAll(map.get(i), String.valueOf(i));
            }
        }
        System.out.println(s);

    }
}
