package com.newcore.design.patterns.adapter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 音频播放器适配器类
 * @author zhouchaowei
 */
public class AudioPlayer implements MediaPlayer{

    private static final Logger logger = LoggerFactory.getLogger(AudioPlayer.class);

    MediaAdapter mediaAdapter;

    /**
     * 播放方法
     * @param audioType 音频类型
     * @param fileName  文件名称
     */
    @Override
    public void play(String audioType, String fileName) {
        /* 播放 MP3 音乐文件的内置支持 */
        if(audioType.equalsIgnoreCase("MP3")){
            logger.info("文件:《{}》为MP3单音频文件,开始解析!",fileName);
            logger.info("正在解析文件......");
            logger.info("解析完成!开始播放...");
        }else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            logger.info("解析失败!未知的音频格式:{}",audioType);
        }
    }
}
