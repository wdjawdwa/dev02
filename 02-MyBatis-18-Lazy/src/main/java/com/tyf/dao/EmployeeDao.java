package com.tyf.dao;

import com.tyf.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-12-19:59
 */
public interface EmployeeDao {
    //根据部门id查询部门下的所有员工
    List<Employee> findById(@Param("id") Integer id);
}
