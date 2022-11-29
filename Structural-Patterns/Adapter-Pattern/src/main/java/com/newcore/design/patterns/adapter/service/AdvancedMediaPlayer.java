package com.newcore.design.patterns.adapter.service;

/**
 * 高级媒体播放器接口
 * @author zhouchaowei
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放VLC格式文件
     * @param fileName 文件名称
     */
    void playVlc(String fileName);

    /**
     * 播放MP4格式文件
     * @param fileName 文件名称
     */
    void playMp4(String fileName);
}
