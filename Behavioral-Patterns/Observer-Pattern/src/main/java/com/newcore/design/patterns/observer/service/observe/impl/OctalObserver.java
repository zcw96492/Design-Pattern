package com.newcore.design.patterns.observer.service.observe.impl;

import com.newcore.design.patterns.observer.service.Subject;
import com.newcore.design.patterns.observer.service.observe.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 八进制观察者类
 * @author zhouchaowei
 */
public class OctalObserver extends Observer {

    private static final Logger logger = LoggerFactory.getLogger(OctalObserver.class);

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 更新
     */
    @Override
    public void update() {
        logger.info("Octal String:{}",Integer.toOctalString(subject.getState()));
    }
}
