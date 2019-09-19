package com.company;

public class Songs {
    private String title;
    private String artist;

    public Songs(String title, String artist){
        this.title = title;
        this.artist = artist;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void play(){
        System.out.println(title);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void favoriteTrack(){
        System.out.println(artist + " " + title );
    }

    @Override
    public String toString() {
        return "Songs{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
