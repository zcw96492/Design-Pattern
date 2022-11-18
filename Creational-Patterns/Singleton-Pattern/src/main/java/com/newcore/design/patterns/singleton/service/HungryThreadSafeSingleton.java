package com.newcore.design.patterns.singleton.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 饿汉式单例类(线程安全)
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * @author Zhou Chaowei
 */
public class HungryThreadSafeSingleton {

    private static final Logger logger = LoggerFactory.getLogger(HungryThreadSafeSingleton.class);

    /** 声明饿汉式单例的实例对象 */
    private static HungryThreadSafeSingleton instance = new HungryThreadSafeSingleton();

    /**
     * 构造方法私有化
     */
    private HungryThreadSafeSingleton(){}

    /**
     * 获取实例对象方法（这种方式比较常用，但容易产生垃圾对象）
     * 优点：没有加锁，执行效率会提高。
     * 缺点：类加载时就初始化，浪费内存。
     * 使用场景：它基于Classloader机制避免了多线程的同步问题。
     *         不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，但是也不能确定有其他的方式（或者其他的静态方法）导致类装载。
     *         这时候初始化instance显然没有达到懒加载的效果。
     * @return 单例对象
     */
    public static HungryThreadSafeSingleton getInstance(){
        return instance;
    }
}
