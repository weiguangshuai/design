package com.weigs.AdapterPattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "boby.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "longong.vlc");
        audioPlayer.play("avi", "不存在的.avi");
    }
}
