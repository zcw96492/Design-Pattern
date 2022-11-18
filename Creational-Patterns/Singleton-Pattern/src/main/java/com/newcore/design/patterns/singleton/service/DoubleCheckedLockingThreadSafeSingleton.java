package com.newcore.design.patterns.singleton.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 双检锁/双重校验锁单例类
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * @author Zhou Chaowei
 */
public class DoubleCheckedLockingThreadSafeSingleton {

    private static final Logger logger = LoggerFactory.getLogger(DoubleCheckedLockingThreadSafeSingleton.class);

    /** 声明单例的实例对象 */
    private volatile static DoubleCheckedLockingThreadSafeSingleton instance;

    /**
     * 构造方法私有化
     */
    private DoubleCheckedLockingThreadSafeSingleton(){}

    /**
     * 获取实例对象方法（这种方式采用双锁机制，安全且在多线程情况下能保持高性能）
     * @return 单例对象
     */
    public static DoubleCheckedLockingThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
