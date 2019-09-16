package com.company;

public class Songs {
    public String title;
    public String artist;

    public Songs(String title, String artist){
        this.title = title;
        this.artist = artist;

    }
    public void setTitle(String title){
        this.title = title;
    }
    public void play(){
        System.out.println(title);
    }
    public void favoriteTrack(String[] Songs){
        System.out.println(Songs[Songs.length - 2]);
    }

    @Override
    public String toString() {
        return "Songs{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
