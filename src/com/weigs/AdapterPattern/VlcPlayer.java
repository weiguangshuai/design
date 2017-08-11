package com.weigs.AdapterPattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing Vlc file:" + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
