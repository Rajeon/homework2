package com.company;

public class SongsTest {
    public static void main(String[] args) {
       Songs great = new Songs("Sandra's Rose", "Drake" );
       great.getArtist();
       great.getTitle();
       great.setTitle("Sandra's Rose");
       great.setArtist("Drake");
       great.favoriteTrack();
    }
}
