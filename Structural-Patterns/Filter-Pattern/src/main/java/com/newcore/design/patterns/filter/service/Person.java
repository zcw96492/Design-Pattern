package com.newcore.design.patterns.filter.service;

/**
 * 人员实体类
 * @author zhouchaowei
 */
public class Person {

    /** 姓名 */
    private String name;

    /** 性别 */
    private String gender;

    /** 婚姻状态 */
    private String maritalStatus;

    /**
     * 构造器
     * @param name 姓名
     * @param gender 性别
     * @param maritalStatus 婚姻状态
     */
    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
