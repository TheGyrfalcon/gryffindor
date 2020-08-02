package com.thegyrfalcon.gryffindor.designpatterns.structural.adapter;

public class MP3 implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("[MP3.play] => Playing MP3 file -> "+fileName);
    }
}
