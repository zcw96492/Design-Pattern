package com.newcore.design.patterns.template.service;

/**
 * 游戏抽象类
 * @author zhouchaowei
 */
public abstract class Game {

    /**
     * 初始化
     */
    abstract void initialize();

    /**
     * 游戏开始
     */
    abstract void startPlay();

    /**
     * 游戏结束
     */
    abstract void endPlay();

    /**
     * 模版
     */
    public final void play(){

        /* 初始化游戏 */
        initialize();

        /* 开始游戏 */
        startPlay();

        /* 结束游戏 */
        endPlay();
    }
}
