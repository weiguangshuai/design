package com.weigs.AdapterPattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdaptor mediaAdaptor;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file:" + filename);
        } else if (audioType.equalsIgnoreCase("mp4") ||
                audioType.equalsIgnoreCase("vlc")) {
            mediaAdaptor = new MediaAdaptor(audioType);
            mediaAdaptor.play(audioType, filename);

        } else {
            System.out.println("Invalid media. " + audioType + " format not support");
        }
    }
}
