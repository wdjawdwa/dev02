package com.tyf.test;


import com.tyf.dao.DepartmentDao;
import com.tyf.dao.EmployeeDao;
import com.tyf.dao.StudentDao;
import com.tyf.dao.SubjectDao;
import com.tyf.entity.Department;
import com.tyf.entity.Employee;
import com.tyf.entity.Student;
import com.tyf.entity.Subject;
import com.tyf.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-06-13:44
 */
public class MoreTableTest {

    @Test
    public void testSubject(){
        SubjectDao subjectDao = MyBatisUtil.getMapper(SubjectDao.class);

        List<Subject> subjects = subjectDao.findAll();

        for (Subject subject : subjects) {
            System.out.println(subject);
        }

        MyBatisUtil.commit();
    }

    @Test
    public void testStudent(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findAll();

        for (Student student : students) {
            System.out.println(student);
        }

        MyBatisUtil.commit();
    }

    @Test
    public void testDepartment(){
        DepartmentDao departmentDao = MyBatisUtil.getMapper(DepartmentDao.class);

        List<Department> departments = departmentDao.findAll();

        for (Department department : departments) {
            System.out.println(department);
        }

        MyBatisUtil.commit();
    }

    @Test
    public void test(){
        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);

        List<Employee> employees = employeeDao.findAll();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        MyBatisUtil.commit();
    }
}