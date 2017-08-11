package com.weigs.AdapterPattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class MediaAdaptor implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaptor(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
