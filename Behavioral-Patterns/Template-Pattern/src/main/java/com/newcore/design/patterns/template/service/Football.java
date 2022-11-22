package com.newcore.design.patterns.template.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 足球(运动)
 * @author zhouchaowei
 */
public class Football extends Game{

    private static final Logger logger = LoggerFactory.getLogger(Football.class);

    /**
     * 初始化
     */
    @Override
    void initialize() {
        logger.info("足球游戏已初始化! 请准备......");
    }

    /**
     * 游戏开始
     */
    @Override
    void startPlay() {
        logger.info("足球游戏已开始! 尽情享受游戏吧!");
    }

    /**
     * 游戏结束
     */
    @Override
    void endPlay() {
        logger.info("足球游戏结束!");
    }
}
