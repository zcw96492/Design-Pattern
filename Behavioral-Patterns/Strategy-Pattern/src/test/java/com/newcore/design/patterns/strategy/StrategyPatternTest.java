package com.newcore.design.patterns.strategy;

import com.newcore.design.patterns.strategy.service.Context;
import com.newcore.design.patterns.strategy.service.OperationAdd;
import com.newcore.design.patterns.strategy.service.OperationMultiply;
import com.newcore.design.patterns.strategy.service.OperationSubtract;
import org.junit.jupiter.api.Test;

/**
 * 策略模式测试类
 * @author zhouchaowei
 */
public class StrategyPatternTest {

    @Test
    public void test(){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
