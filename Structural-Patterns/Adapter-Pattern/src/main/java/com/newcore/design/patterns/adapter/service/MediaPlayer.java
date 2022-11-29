package com.newcore.design.patterns.adapter.service;

/**
 * 媒体播放器接口
 * @author zhouchaowei
 */
public interface MediaPlayer {

    /**
     * 播放方法
     * @param audioType 音频类型
     * @param fileName 文件名称
     */
    void play(String audioType, String fileName);
}
