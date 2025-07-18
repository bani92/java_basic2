package org.example.codeingTest;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 좌표_정렬하기 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            points[i] = new Point(a,b);
        }

        Arrays.sort(points, (p1, p2) -> {
            if(p1.y == p2.y) {
                return p1.x - p2.x;
            } else {
                return p1.y - p2.y;
            }
        });

        for(Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
    }


}
