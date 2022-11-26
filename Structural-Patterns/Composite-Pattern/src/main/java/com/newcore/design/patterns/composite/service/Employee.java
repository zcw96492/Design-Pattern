package com.newcore.design.patterns.composite.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工实体类
 * @author zhouchaowei
 */
public class Employee {

    /** 员工姓名 */
    private String name;
    /** 员工部门 */
    private String dept;
    /** 员工薪酬 */
    private int salary;
    /** 下属员工 */
    private List<Employee> subordinates;

    /**
     * 构造方法
     * @param name 姓名
     * @param dept 部门
     * @param salary 薪酬
     */
    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
