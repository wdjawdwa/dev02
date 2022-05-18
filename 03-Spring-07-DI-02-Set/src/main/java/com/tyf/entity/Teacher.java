package com.tyf.entity;

/**
 * @author tyf
 * @create 2022-03-15-16:48
 */
public class Teacher {
    private String name;
    private Integer age;
    private Student student;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                '}';
    }
}
