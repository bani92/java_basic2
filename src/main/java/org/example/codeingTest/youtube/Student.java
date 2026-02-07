package org.example.codeingTest.youtube;

public class Student {

    public Student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    private String name;
    private String no;

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
