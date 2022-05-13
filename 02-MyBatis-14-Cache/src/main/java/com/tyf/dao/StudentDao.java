package com.tyf.dao;


import com.tyf.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author tyf
 * @create 2022-03-06-16:31
 */
public interface StudentDao {
    Student findById(@Param("id") Integer id);

    int update(Student student);
}
