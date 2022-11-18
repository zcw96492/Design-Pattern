package com.newcore.design.patterns.singleton.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 登记式/静态内部类单例类
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 * @author Zhou Chaowei
 */
public class RegisterOrInnerClassThreadSafeSingleton {

    private static final Logger logger = LoggerFactory.getLogger(RegisterOrInnerClassThreadSafeSingleton.class);

    /**
     * 声明单例对象的内部类
     */
    private static class SingletonHolder {
        private static final RegisterOrInnerClassThreadSafeSingleton INSTANCE = new RegisterOrInnerClassThreadSafeSingleton();
    }

    /**
     * 构造方法私有化
     */
    private RegisterOrInnerClassThreadSafeSingleton (){}

    /**
     * 获取实例对象方法（）
     * 优点：这种方式能达到双检锁方式一样的功效，但实现更简单。
     * 缺点：只适用于静态域的情况，对静态域使用延迟初始化，应使用这种方式而不是双检锁方式，双检锁方式可在实例域需要延迟初始化时使用。
     * 使用场景：只适用于静态域的情况。
     * @return 单例对象
     */
    public static RegisterOrInnerClassThreadSafeSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
