package com.tyf.dao;

import com.tyf.entity.Student;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-06-16:31
 */
public interface StudentDao {
    List<Student> findAll();
    Student findById(Integer id);
    List<Student> findByName(String name);
    List<Student> findByAge(Byte age);
    List<Student> findByGender(String gender);
}
