package com.thegyrfalcon.gryffindor.designpatterns.structural.adapter;

public class MediaFormatAdapter implements  MediaPlayer {

    private MediaPackage media;

     public MediaFormatAdapter(MediaPackage mediaPackage) {
        this.media = mediaPackage;
    }

    @Override
    public void play(String fileName) {
        media.play(fileName);
    }
}
