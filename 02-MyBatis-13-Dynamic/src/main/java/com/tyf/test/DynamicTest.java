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
public class DynamicTest {

    @Test
    public void testUpdate(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(8);
        student.setName("爷傲奈我何");

        int affectedRows = studentDao.update(student);

        MyBatisUtil.commit();
    }

    @Test
    public void testFindByStudent(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        Student student = new Student();
        student.setAge((byte)22);

        List<Student> students = studentDao.findByStudent(student);

        for (Student temp : students) {
            System.out.println(temp);
        }

        MyBatisUtil.commit();
    }

    @Test
    public void testFindKeyword(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findByKeyword(null, 19);

        for (Student student : students) {
            System.out.println(student);
        }

        MyBatisUtil.commit();
    }

    @Test
    public void testFindAll(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findAll();

        for (Student student : students) {
            System.out.println(student);
        }

        MyBatisUtil.commit();
    }
}
