package com.newcore.design.patterns;

import com.newcore.design.patterns.adapter.service.AudioPlayer;
import org.junit.jupiter.api.Test;

/**
 * 适配器模式测试类
 * @author zhouchaowei
 */
public class AdapterPatternTest {

    @Test
    public void test(){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "真的爱你.mp3");
        audioPlayer.play("MP4", "夏洛特烦恼.mp4");
        audioPlayer.play("VLC", "还以为自己是处女的心爱的妹妹在我所有的朋友中都被当成玩具.vlc");
        audioPlayer.play("AVI", "恋爱百分百.avi");
    }
}
