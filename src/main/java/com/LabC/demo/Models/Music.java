package com.LabC.demo.Models;

public class Music {

    String genre;
    boolean explicit;
    String title;

    public Music(){};

    public Music(String genre, boolean explicit, String title){
        this.genre = genre;
        this.explicit = explicit;
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Music{" +
                "genre='" + genre + '\'' +
                ", explicit=" + explicit +
                ", title='" + title + '\'' +
                '}';
    }
}
