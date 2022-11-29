package com.newcore.design.patterns.adapter.service;

import com.newcore.design.patterns.adapter.service.impl.Mp4Player;
import com.newcore.design.patterns.adapter.service.impl.VlcPlayer;

/**
 * 音频播放器适配器类
 * @author zhouchaowei
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;

    /**
     * 构造方法
     * @param audioType 音频类型
     */
    public MediaAdapter(String audioType){
        switch (audioType){
            case "VLC" :
                advancedMusicPlayer = new VlcPlayer();
                break;
            case "MP4" :
                advancedMusicPlayer = new Mp4Player();
                break;
            default:break;
        }
    }

    /**
     * 播放方法
     * @param audioType 音频类型
     * @param fileName  文件名称
     */
    @Override
    public void play(String audioType, String fileName) {
        switch (audioType){
            case "VLC" :
                advancedMusicPlayer.playVlc(fileName);
                break;
            case "MP4" :
                advancedMusicPlayer.playMp4(fileName);
                break;
            default:break;
        }
    }
}
