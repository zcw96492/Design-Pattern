package com.newcore.design.patterns.command.service;

/**
 * 卖石头行为类
 * @author zhouchaowei
 */
public class SellStock implements Order{

    private final Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    /**
     * 执行命令方法
     */
    @Override
    public void execute() {
        stock.sell();
    }
}
