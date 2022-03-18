package com.movies.Model;

import java.sql.Date;

public class Show {
    private String showId;
    private Movie movie;
    private Screen screen;
    private String startTime;
    private Integer durationInSeconds;

    public Show(String showId, Movie movie, Screen screen, String startTime, Integer durationInSeconds) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.durationInSeconds = durationInSeconds;
    }
}
