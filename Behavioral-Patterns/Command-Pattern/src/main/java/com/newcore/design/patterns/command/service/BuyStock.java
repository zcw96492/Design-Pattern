package com.newcore.design.patterns.command.service;

/**
 * 买石头行为类
 * @author zhouchaowei
 */
public class BuyStock implements Order{

    private final Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    /**
     * 执行命令方法
     */
    @Override
    public void execute() {
        stock.buy();
    }
}
