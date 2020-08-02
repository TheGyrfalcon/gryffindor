package com.thegyrfalcon.gryffindor.designpatterns.structural.adapter;

public class VLC implements MediaPackage {

    @Override
    public void play(String fileName) {
        System.out.println("[VLC.play] => Playing VLC file -> "+fileName);
    }
}
