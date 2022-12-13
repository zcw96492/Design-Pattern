package com.newcore.design.patterns.nullObject;

import com.newcore.design.patterns.nullObject.service.AbstractCustomer;
import com.newcore.design.patterns.nullObject.service.CustomerFactory;
import org.junit.jupiter.api.Test;

/**
 * 空对象模式测试类
 * @author zhouchaowei
 */
public class NullObjectPatternTest {

    @Test
    public void test(){
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
        AbstractCustomer customer5 = CustomerFactory.getCustomer("Joe");

        System.out.println("Customers:");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println(customer5.getName());
    }
}
