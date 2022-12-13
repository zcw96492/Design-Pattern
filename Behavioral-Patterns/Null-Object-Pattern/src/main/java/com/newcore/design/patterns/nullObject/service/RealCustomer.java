package com.newcore.design.patterns.nullObject.service;

/**
 * 真实客户类
 * @author zhouchaowei
 */
public class RealCustomer extends AbstractCustomer{

    /**
     * 带参构造器
     * @param name 姓名
     */
    public RealCustomer(String name) {
        this.name = name;
    }

    /**
     * 判断是否非空
     * @return 判断结果
     */
    @Override
    public boolean isNull() {
        return false;
    }

    /**
     * 获取姓名
     * @return 客户姓名
     */
    @Override
    public String getName() {
        return name;
    }
}
