package org.example.codeingTest.promgrammers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수_Hash {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<part.length; i++) {
            map.put(part[i], map.getOrDefault(part[i] , 0) + 1);
        }

        String diffString = "";
        for(int i=0; i<comp.length; i++) {
            map.put(comp[i], map.getOrDefault(comp[i], 0) -1);

        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() != 0) {
                diffString = entry.getKey();
                break;
            }
        }

        System.out.println(diffString);

    }
}
