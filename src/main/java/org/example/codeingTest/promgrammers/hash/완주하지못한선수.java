package org.example.codeingTest.promgrammers.hash;

import java.util.Arrays;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] part = {"mislav", "stanko", "mislav", "ana"};
        String[] comp = {"stanko", "ana", "mislav"};

        Arrays.sort(part);
        Arrays.sort(comp);
        String diffString = "";
        for(int i=0; i<comp.length; i++) {
            if(!comp[i].equals(part[i])) {
                diffString = part[i];
                break;
            }
        }

        if("".equals(diffString)) {
            diffString = part[part.length - 1];
        }

        System.out.println(diffString);
    }
}
