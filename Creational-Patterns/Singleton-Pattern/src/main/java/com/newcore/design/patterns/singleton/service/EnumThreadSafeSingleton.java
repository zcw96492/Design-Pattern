package com.newcore.design.patterns.singleton.service;

/**
 * 枚举单例类
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * @author Zhou Chaowei
 */
public enum EnumThreadSafeSingleton {

    INSTANCE;

    /**
     * 优点：它更简洁，自动支持序列化机制，绝对防止多次实例化。是实现单例模式的最佳方法。
     * 缺点：还没有被广泛采用，写法让人感觉生疏，在实际工作中，也很少用。不能通过Reflection Attack来调用私有构造方法。
     *
     * From 《Effective Java》
     * author: Josh Bloch
     */
    public void whateverMethod() {}
}
