package com.tyf.entity;

/**
 * @author tyf
 * @create 2022-03-14-21:18
 */
public class Student {
    private Integer id;
    private String name;
    private Byte age;

    public Student() {
    }

    public Student(Integer id, String name, Byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
