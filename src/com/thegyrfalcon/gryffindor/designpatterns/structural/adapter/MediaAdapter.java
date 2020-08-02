package com.thegyrfalcon.gryffindor.designpatterns.structural.adapter;

public class MediaAdapter implements  MediaPlayer {

    private AdvancedMediaPlayer media;

     public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.media = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        System.out.println("\n[MediaAdapter.play] => Using Media Adapter.");
        media.play(fileName);
    }
}
