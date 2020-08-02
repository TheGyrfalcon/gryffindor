package com.thegyrfalcon.gryffindor.designpatterns.structural.adapter;

public class VLC implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("[VLC.play] => Playing VLC file -> "+fileName);
    }
}
