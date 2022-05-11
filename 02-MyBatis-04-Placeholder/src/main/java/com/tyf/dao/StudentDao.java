package com.tyf.dao;

import com.tyf.entity.Student;

import java.util.List;

public interface StudentDao {
    // 查询指定年龄的学生
    List<Student> findByAge(String age);

    List<Student> findById(String id);
}
