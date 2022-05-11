package com.tyf.test;


import com.tyf.dao.StudentDao;
import com.tyf.entity.Student;
import com.tyf.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-06-13:44
 */
public class MyBatisTest {
    @Test
    public void test() {
        try {
            StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

            List<Student> students = studentDao.findAll();

            for (Student student : students) {
                System.out.println(student);
            }

            //成功就提交
            MyBatisUtil.commit();
        } catch (Exception e) {
            //失败就回滚
            MyBatisUtil.rollback();
            e.printStackTrace();
        }
    }
}