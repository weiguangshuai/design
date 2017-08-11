package com.weigs.AdapterPattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing Mp4 file:" + filename);
    }
}
