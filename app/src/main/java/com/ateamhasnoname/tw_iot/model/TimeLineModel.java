package com.ateamhasnoname.tw_iot.model;

import java.io.Serializable;

/**
 * Created by imittal on 7/9/16.
 */
public class TimeLineModel implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
