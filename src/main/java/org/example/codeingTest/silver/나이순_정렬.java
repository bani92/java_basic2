package org.example.codeingTest.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class 나이순_정렬 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];


        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            students[i] = new Student(age, name);
        }

        Arrays.sort(students, (a, b) -> {
            return a.age - b.age;
        });

        for(Student student : students) {
            bw.write(student.age + " " + student.name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }


}
