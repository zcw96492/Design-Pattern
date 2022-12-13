package com.newcore.design.patterns.nullObject.service;

/**
 * 客户抽象类
 * @author zhouchaowei
 */
public abstract class AbstractCustomer {

    /** 姓名 */
    protected String name;

    /**
     * 判断是否非空
     * @return 判断结果
     */
    public abstract boolean isNull();

    /**
     * 获取姓名
     * @return 客户姓名
     */
    public abstract String getName();
}
