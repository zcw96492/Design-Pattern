package com.newcore.design.patterns.nullObject.service;

/**
 * 空客户类
 * @author zhouchaowei
 */
public class NullCustomer extends AbstractCustomer {

    /**
     * 判断是否非空
     * @return 判断结果
     */
    @Override
    public boolean isNull() {
        return true;
    }

    /**
     * 获取姓名
     * @return 客户姓名
     */
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
