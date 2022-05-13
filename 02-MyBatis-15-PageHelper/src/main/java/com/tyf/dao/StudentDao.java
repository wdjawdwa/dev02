package com.tyf.dao;


import com.tyf.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
}
