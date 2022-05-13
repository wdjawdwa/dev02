package com.tyf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-09-20:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Integer id;
    private String name;
    //一对多关系，一个部门中有多个员工
    private List<Employee> employees;
}
