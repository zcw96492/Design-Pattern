package com.newcore.design.patterns.observer.service.observe.impl;

import com.newcore.design.patterns.observer.service.Subject;
import com.newcore.design.patterns.observer.service.observe.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 十六进制观察者类
 * @author zhouchaowei
 */
public class HexadecimalObserver extends Observer {

    private static final Logger logger = LoggerFactory.getLogger(HexadecimalObserver.class);

    public HexadecimalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 更新
     */
    @Override
    public void update() {
        logger.info("Hexadecimal String:{}",Integer.toHexString(subject.getState()));
    }
}
