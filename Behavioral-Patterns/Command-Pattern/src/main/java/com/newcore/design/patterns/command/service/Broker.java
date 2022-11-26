package com.newcore.design.patterns.command.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用协调类
 * @author zhouchaowei
 */
public class Broker {

    private final List<Order> orderList = new ArrayList<>();

    /**
     * 添加命令方法
     * @param order 命令
     */
    public void takeOrder(Order order){
        orderList.add(order);
    }

    /**
     * 执行命令方法
     */
    public void executeOrder(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
