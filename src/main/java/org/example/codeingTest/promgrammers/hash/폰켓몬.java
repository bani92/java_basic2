package org.example.codeingTest.promgrammers.hash;

import java.util.HashMap;

public class 폰켓몬 {
    public static void main(String[] args) {

        int[] num = {3,3,3,2,2,2};
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : num) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxCnt = num.length / 2;
        int size = map.size();
        if(maxCnt < size) {
            result = maxCnt;
        } else {
            result = size;
        }

        System.out.println(result);

    }
}
