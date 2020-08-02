package com.thegyrfalcon.gryffindor.designpatterns.structural.adapter;

public class MP4 implements MediaPackage {

    public MP4() {
    }

    @Override
    public void play(String fileName) {
        System.out.println("[MP4.play] => Playing MP4 -> "+fileName);
    }
}
