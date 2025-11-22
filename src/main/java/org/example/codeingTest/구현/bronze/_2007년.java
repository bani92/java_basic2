package org.example.codeingTest.구현.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2007년 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] dayInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDay = 0;

        for(int i=0; i<x; i++) {
            totalDay += dayInMonth[i];
        }

        totalDay += y;

        System.out.println(dayOfWeek[totalDay % 7]);


    }
}
