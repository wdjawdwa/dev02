package com.tyf.dao;

import com.tyf.entity.Student;

import java.util.List;

public interface StudentDao {
    int getTotalCount();

    List<Student> getList(int pageNo, int pageSize);
}
