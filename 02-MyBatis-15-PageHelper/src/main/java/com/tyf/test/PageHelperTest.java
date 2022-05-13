package com.tyf.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tyf.dao.StudentDao;
import com.tyf.entity.Student;
import com.tyf.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class PageHelperTest {
    @Test
    public void test() {
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        // 开启分页
        PageHelper.startPage(-1, 2);

        List<Student> students = studentDao.findAll();

        // 封装PageInfo对象
        PageInfo<Student> pageInfo = new PageInfo<>(students);

        System.out.println(pageInfo);
    }

}
