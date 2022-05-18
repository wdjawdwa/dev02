package com.tyf.entity;

/**
 * @author tyf
 * @create 2022-03-15-17:05
 */
public class Car {
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
