package com.tyf.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author tyf
 * @create 2022-03-15-16:56
 */
public class ComplexType {
    private Object[] objects;
    private List<String> list;
    private Set<Integer> set;
    private Map<String ,Object> map;

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ComplexType{" +
                "objects=" + Arrays.toString(objects) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
