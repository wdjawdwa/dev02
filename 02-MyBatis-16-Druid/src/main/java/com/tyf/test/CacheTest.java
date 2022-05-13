package com.tyf.test;


import com.tyf.dao.StudentDao;
import com.tyf.entity.Student;
import com.tyf.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class CacheTest {
    @Test
    public void test(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
        MyBatisUtil.commit();
    }
}
