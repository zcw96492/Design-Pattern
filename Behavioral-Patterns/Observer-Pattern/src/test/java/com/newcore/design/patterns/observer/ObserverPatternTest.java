package com.newcore.design.patterns.observer;

import com.newcore.design.patterns.observer.service.Subject;
import com.newcore.design.patterns.observer.service.observe.impl.BinaryObserver;
import com.newcore.design.patterns.observer.service.observe.impl.HexadecimalObserver;
import com.newcore.design.patterns.observer.service.observe.impl.OctalObserver;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 观察着模式测试类
 * @author zhouchaowei
 */
public class ObserverPatternTest {

    private static final Logger logger = LoggerFactory.getLogger(ObserverPatternTest.class);

    @Test
    public void test(){
        Subject subject = new Subject();

        new HexadecimalObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        logger.info("First state change: 15");
        subject.setState(15);
        logger.info("Second state change: 10");
        subject.setState(10);
    }
}
