package org.example.codeingTest.youtube;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class exam_1 {
    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();

        list.add(new Student("김길동", "1000"));
        list.add(new Student("화길동", "2000"));
        list.add(new Student("수길동", "3000"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        while(true) {
            System.out.println("계속 검색을 하고싶으면 y, 종료하고 싶으면 n");
            String input = br.readLine();

            if(input.equals("y")) {
                System.out.println("검색을 시작합니다.");
                String name = br.readLine();
                boolean flag = false;

                for (Student stu : list) {
                    if(stu.getName().equals(name)) {
                        System.out.println("해당하는 학생의 학번 : " +stu.getNo());
                        flag = true;
                    }
                }

                if(!flag) {
                    System.out.println("해당하는 학생이름이 없습니다.");
                }


            } else if(input.equals("n")) {
                break;
            }
        }

        System.out.println("종료되었습니다.");


    }
}
