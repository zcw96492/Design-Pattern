package com.newcore.design.patterns.singleton.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 饿汉式单例类(线程不安全)
 * 是否Lazy初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * @author zhouchaowei
 */
public class HungryThreadUnSafeSingleton {

    private static final Logger logger = LoggerFactory.getLogger(HungryThreadUnSafeSingleton.class);

    /** 声明饿汉式单例的实例对象 */
    private static HungryThreadUnSafeSingleton instance;

    /**
     * 构造方法私有化
     */
    private HungryThreadUnSafeSingleton(){}

    /**
     * 获取实例对象方法（严格意义上它并不算单例模式）
     * 缺点：因为没有加锁 synchronized，懒加载很明显，在多线程不能正常工作
     * 使用场景：非多线程环境下。
     * @return 单例对象
     */
    public static HungryThreadUnSafeSingleton getInstance() {
        if (instance == null) {
            instance = new HungryThreadUnSafeSingleton();
        }
        return instance;
    }
}
