package org.example.codeingTest.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class User {
    String name;
    int level;
    int power;

    public User(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.power = power;
    }
}


public class ArraySort_1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        User[] users = new User[N];

        for(int i=0 ;i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int level = Integer.parseInt(st.nextToken());
            int power = Integer.parseInt(st.nextToken());

            users[i] = new User(name, level, power);
        }

        Arrays.sort(users, (s1, s2) -> {
            if(s1.level == s2.level) {
                return s2.power - s1.power;
            } else {
                return s2.level - s1.level;
            }
        });

        for (User user : users) {
            bw.write(user.name + " " + user.power + " " + user.level);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
