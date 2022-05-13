package com.tyf.entity;

import lombok.Data;

/**
 * @author tyf
 * @create 2022-03-09-20:19
 */
@Data
public class Employee {
    private Integer id;
    private String  name;
    //一对一，一个员工对应一个部门
    private Department department;
}
