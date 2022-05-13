package com.tyf.dao;

import com.tyf.entity.Department;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-10-20:21
 */
public interface DepartmentDao {
    List<Department> findAll();
}
