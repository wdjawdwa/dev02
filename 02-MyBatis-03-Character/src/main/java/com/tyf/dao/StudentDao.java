package com.tyf.dao;



import com.tyf.entity.Student;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-06-16:31
 */
public interface StudentDao {
    //查询小于指定年龄的学生
    List<Student> findByLessThanAge(Integer age);

    //查询大于指定年龄的学生
    List<Student> findGreaterThanAge(Integer age);
}
