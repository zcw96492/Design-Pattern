package com.newcore.design.patterns.nullObject.service;

/**
 * 客户工厂类
 * @author zhouchaowei
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    /**
     * 获取客户
     * @param name 姓名
     * @return 抽象客户类
     */
    public static AbstractCustomer getCustomer(String name){
        for (String nameIndex : names) {
            if (nameIndex.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
