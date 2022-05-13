package com.tyf.entity;

import lombok.Data;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-12-17:40
 */
@Data
public class Department {
    private Integer id;
    private String name;
    List<Employee> employees;
}
