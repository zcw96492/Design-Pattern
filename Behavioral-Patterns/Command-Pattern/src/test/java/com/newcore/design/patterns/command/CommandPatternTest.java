package com.newcore.design.patterns.command;

import com.newcore.design.patterns.command.service.Broker;
import com.newcore.design.patterns.command.service.BuyStock;
import com.newcore.design.patterns.command.service.SellStock;
import com.newcore.design.patterns.command.service.Stock;
import org.junit.jupiter.api.Test;

/**
 * 命令模式测试类
 * @author zhouchaowei
 */
public class CommandPatternTest {

    @Test
    public void test(){
        /* 1.创建石头类 */
        Stock stock = new Stock();
        /* 2.创建买石头类 */
        BuyStock buyStockOrder = new BuyStock(stock);
        /* 3.创建卖石头类 */
        SellStock sellStockOrder = new SellStock(stock);
        /* 4.创建命令调用类,并添加命令 */
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        /* 5.执行命令 */
        broker.executeOrder();
    }
}
