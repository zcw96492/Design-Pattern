package com.newcore.design.patterns.singleton.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 饿汉式单例类(线程安全)
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * @author zhouchaowei
 */
public class HungryThreadSafeSingleton {

    private static final Logger logger = LoggerFactory.getLogger(HungryThreadSafeSingleton.class);

    /** 声明饿汉式单例的实例对象 */
    private static HungryThreadSafeSingleton instance;

    /**
     * 构造方法私有化
     */
    private HungryThreadSafeSingleton(){}

    /**
     * 获取实例对象方法(这种方式具备很好的懒加载，能够在多线程中很好的工作。但是，效率很低，99%情况下不需要同步)
     * 优点：第一次调用才初始化，避免内存浪费。
     * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
     * 使用场景：getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）
     * @return 单例对象
     */
    public static synchronized HungryThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new HungryThreadSafeSingleton();
        }
        return instance;
    }
}
