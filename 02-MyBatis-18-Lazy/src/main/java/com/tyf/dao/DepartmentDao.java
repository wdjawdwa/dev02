package com.tyf.dao;

import com.tyf.entity.Department;

/**
 * @author tyf
 * @create 2022-03-12-20:11
 */
public interface DepartmentDao {
    //根据id查询当前部门以及对应的所有员工
    Department findById(Integer id);
}
