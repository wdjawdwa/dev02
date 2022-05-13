package com.tyf.test;


import com.tyf.dao.StudentMapper;
import com.tyf.entity.Student;
import com.tyf.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class LazyTest {
    @Test
    public void test(){
        StudentMapper studentMapper = MyBatisUtil.getMapper(StudentMapper.class);

        List<Student> students = studentMapper.selectByExampleWithBLOBs(null);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
