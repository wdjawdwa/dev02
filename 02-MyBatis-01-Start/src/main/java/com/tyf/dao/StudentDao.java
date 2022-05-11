package com.tyf.dao;

import com.tyf.entity.Student;

import java.util.List;

public interface StudentDao {
    Student findById();

    List<Student> findAll();

    Student findStudentById(Integer id);
}
