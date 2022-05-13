package com.tyf.dao;

import com.tyf.entity.Employee;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-09-20:22
 */
public interface EmployeeDao {
    List<Employee> findAll();
}
