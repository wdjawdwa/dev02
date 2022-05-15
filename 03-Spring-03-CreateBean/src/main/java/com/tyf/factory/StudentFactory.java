package com.tyf.factory;

import com.tyf.entity.Student;

/**
 * @author tyf
 * @create 2022-03-14-21:25
 */
public class StudentFactory {
    public Student getStudent(){
        return new Student();
    }
}
