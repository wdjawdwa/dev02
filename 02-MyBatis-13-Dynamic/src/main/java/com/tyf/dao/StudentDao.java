package com.tyf.dao;


import com.tyf.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-06-16:31
 */
public interface StudentDao {
    List<Student> findAll();

    //模糊查询
    List<Student> findByKeyword(@Param("name") String name ,@Param("age") Integer age);

    List<Student> findByStudent(Student student);

    int update(Student student);
}
