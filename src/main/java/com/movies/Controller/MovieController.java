package com.movies.Controller;

import com.movies.Services.MovieService;

public class MovieController {
    private MovieService movieService;

    public String createMovie(final String movieName){
        return movieService.addMovie(movieName).getId();
    }
}
