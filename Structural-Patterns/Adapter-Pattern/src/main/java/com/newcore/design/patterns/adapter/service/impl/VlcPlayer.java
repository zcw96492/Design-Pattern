package com.newcore.design.patterns.adapter.service.impl;

import com.newcore.design.patterns.adapter.service.AdvancedMediaPlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * VLC文件播放实现类
 * @author zhouchaowei
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    private static final Logger logger = LoggerFactory.getLogger(VlcPlayer.class);

    /**
     * 播放VLC格式文件
     * @param fileName 文件名称
     */
    @Override
    public void playVlc(String fileName) {
        logger.info("文件名:《{}》,开始解析VLC文件!",fileName);
        logger.info("正在解析文件......");
        logger.info("解析完成!开始播放...");
    }

    /**
     * 播放MP4格式文件
     * @param fileName 文件名称
     */
    @Override
    public void playMp4(String fileName) {
        /* TODO 什么也不做 */
    }
}
