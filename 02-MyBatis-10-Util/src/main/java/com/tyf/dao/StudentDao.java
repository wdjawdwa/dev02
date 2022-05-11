package com.tyf.dao;

import com.tyf.entity.Student;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-06-16:31
 */
public interface StudentDao {
    List<Student> findAll();
}
