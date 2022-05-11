package com.tyf.service;

import com.tyf.vo.PageInfo;
import com.tyf.entity.Student;

// 业务层接口
public interface StudentService {
    PageInfo<Student> getPageInfo(int pageNo, int pageSize);
}
