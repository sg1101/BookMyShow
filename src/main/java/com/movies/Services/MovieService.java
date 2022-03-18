package com.movies.Services;

import java.util.HashMap;
import java.util.UUID;

import com.movies.Exceptions.NotFoundException;
import com.movies.Model.Movie;

public class MovieService {
    HashMap<String, Movie> movies;
    MovieService(){
        this.movies = new HashMap<String, Movie> ();
    }

    public Movie addMovie(final String movieName){
        String movieId = UUID.randomUUID().toString();
        Movie movie = new Movie(movieId, movieName);
        this.movies.put(movieId, movie);
        return movie;
    }

    public Movie getMovie(final String movieId){
        if(!movies.containsKey(movieId)){
            throw new NotFoundException();
        }
        return movies.get(movieId);
    }
}
