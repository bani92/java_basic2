package org.example.codeingTest.youtube;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class exam_4 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] array = br.readLine().toCharArray();

        for(int i=0; i<array.length; i++) {
            if(array[i] >= 'a' && array[i] <= 'z') {
                array[i] = (char)(array[i] + ('A' - 'a'));
            } else {
                array[i] = (char)(array[i] - ('A' - 'a'));
            }
        }

        System.out.println(array);

    }
}
