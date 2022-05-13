package com.tyf.test;


import com.tyf.dao.DepartmentDao;
import com.tyf.dao.EmployeeDao;
import com.tyf.entity.Department;
import com.tyf.entity.Employee;
import com.tyf.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class LazyTest {

    @Test
    public void testDepartment(){
        DepartmentDao departmentDao = MyBatisUtil.getMapper(DepartmentDao.class);

        Department department = departmentDao.findById(4);

        System.out.println(department.getName());
    }

    @Test
    public void testEmployee(){
        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);

        List<Employee> employees = employeeDao.findById(1);

        MyBatisUtil.commit();
    }
}
