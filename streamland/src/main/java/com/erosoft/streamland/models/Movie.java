package com.erosoft.streamland.models;

public class Movie {
    private String name;
    private String director;
    private String genre;
    private int year;

    public Movie() {
        super();
    }

    public Movie(String name, String director, String genre, int year) {
        super();
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie <name=" + name + ", genre=" + genre + ", year=" + year + ">";
    }

}
