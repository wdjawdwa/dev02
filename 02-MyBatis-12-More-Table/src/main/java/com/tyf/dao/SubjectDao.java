package com.tyf.dao;

import com.tyf.entity.Subject;

import java.util.List;

/**
 * @author tyf
 * @create 2022-03-10-21:40
 */
public interface SubjectDao {
    List<Subject> findAll();
}
