package com.tyf.entity;

import lombok.Data;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-10-20:53
 */
@Data
public class Subject {
    private Integer id;
    private String name;
    List<Student> students;
}
