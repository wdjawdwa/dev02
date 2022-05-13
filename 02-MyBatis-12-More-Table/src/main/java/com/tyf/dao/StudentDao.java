package com.tyf.dao;

import com.tyf.entity.Student;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-10-20:56
 */
public interface StudentDao {
    List<Student> findAll();
}
