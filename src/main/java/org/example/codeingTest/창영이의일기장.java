package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 창영이의일기장 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = {'a','e','i','o','u'};

        StringBuffer sb = new StringBuffer();
        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            boolean found = false;

            for (int j = 0; j < ch.length; j++) {
                if (str.charAt(i) == ch[j]) {
                    found = true;
                    break;
                }
            }

            if(found) {
                sb.append(str.charAt(i));
                i = i + 2;
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
