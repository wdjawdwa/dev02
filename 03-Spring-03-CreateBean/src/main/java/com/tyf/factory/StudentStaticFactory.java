package com.tyf.factory;

import com.tyf.entity.Student;

/**
 * @author tyf
 * @create 2022-03-14-21:33
 */
public class StudentStaticFactory {
    public static Student getStudent(){
        return new Student();
    }
}
