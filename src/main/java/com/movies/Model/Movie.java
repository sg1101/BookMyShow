package com.movies.Model;

public class Movie {
    private final String movieName;
    private final String movieId;
    public Movie(String movieId, String movieName){
        this. movieName = movieName;
        this.movieId = movieId;
    }

    public String getId(){
        return this.movieId;
    }

    public String getName(){
        return this.movieName;
    }
}
