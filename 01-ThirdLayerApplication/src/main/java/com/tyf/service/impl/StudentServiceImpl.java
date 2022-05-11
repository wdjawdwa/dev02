package com.tyf.service.impl;

import com.tyf.dao.StudentDao;
import com.tyf.dao.impl.StudentDaoImpl;
import com.tyf.vo.PageInfo;
import com.tyf.entity.Student;
import com.tyf.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    // 业务逻辑层依赖数据访问层
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public PageInfo<Student> getPageInfo(int pageNo, int pageSize) {
        int totalCount = studentDao.getTotalCount();
        List<Student> list = studentDao.getList(pageNo, pageSize);

        return new PageInfo<>(totalCount, pageSize, pageNo, list);
    }
}
