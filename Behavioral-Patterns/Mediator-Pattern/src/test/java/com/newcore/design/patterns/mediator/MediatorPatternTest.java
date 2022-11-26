package com.newcore.design.patterns.mediator;

import com.newcore.design.patterns.mediator.service.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 中介者模式测试类
 * @author zhouchaowei
 */
public class MediatorPatternTest {

    private static final Logger logger = LoggerFactory.getLogger(MediatorPatternTest.class);

    /**
     * 测试方法
     */
    @Test
    public void test(){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
