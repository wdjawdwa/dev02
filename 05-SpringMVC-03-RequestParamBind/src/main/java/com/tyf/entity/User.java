package com.tyf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author tyf
 * @create 2022-03-24-19:22
 */
@Data
public class User {
    private String name;
    private Integer age;
    private String gender;
    private String birthday;
    private String info;
}
