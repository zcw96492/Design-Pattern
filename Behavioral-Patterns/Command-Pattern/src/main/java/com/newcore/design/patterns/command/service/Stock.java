package com.newcore.design.patterns.command.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 石头请求类(该类定义了一件物品可以执行的命令)
 * @author zhouchaowei
 */
public class Stock {

    private static final Logger logger = LoggerFactory.getLogger(Stock.class);

    private final String name = "ABC";
    private final int quantity = 10;

    /**
     * 买石头
     */
    public void buy(){
        logger.info("石头:[名称:{},质量:{}],买石头...",name,quantity);
    }

    /**
     * 卖石头
     */
    public void sell(){
        logger.info("石头:[名称:{},质量:{}],卖石头...",name,quantity);
    }
}
