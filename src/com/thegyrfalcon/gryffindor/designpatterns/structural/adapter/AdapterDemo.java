package com.thegyrfalcon.gryffindor.designpatterns.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        MediaPlayer player = new MP3();
        player.play("song.mp3");

        player = new MediaAdapter(new MP4());
        player.play("song.mp4");

        player = new MediaAdapter(new VLC());
        player.play("song.avi");
    }

}
