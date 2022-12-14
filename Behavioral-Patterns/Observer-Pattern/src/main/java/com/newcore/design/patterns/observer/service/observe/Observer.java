package com.newcore.design.patterns.observer.service.observe;

import com.newcore.design.patterns.observer.service.Subject;

/**
 * 观察者类
 * @author zhouchaowei
 */
public abstract class Observer {

    /**
     * 科目
     */
    protected Subject subject;

    /**
     * 更新
     */
    public abstract void update();
}
