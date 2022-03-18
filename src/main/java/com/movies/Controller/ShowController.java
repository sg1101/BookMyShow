package com.movies.Controller;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.movies.Model.Movie;
import com.movies.Services.MovieService;
import com.movies.Services.SeatAvailabilityService;
import com.movies.Services.ShowService;
import com.movies.Services.TheatreService;
import com.movies.Model.Screen;
import com.movies.Model.Seat;
import com.movies.Model.Show;

public class ShowController {
    private final MovieService movieService;
    private final TheatreService theatreService;
    private final ShowService showService;


    public String createShow(final String movieId, final String screenId, final Date startTime, final Integer durationInSeconds){
        final Screen screen = theatreService.getScreen(screenId);
        final Movie movie = movieService.getMovie(movieId);
        return showService.createShow(screen, movie, startTime, durationInSeconds).getId();
    }

    public List<String> getAvailableSeats(final String showId){
        final Show show = showService.getShow(showId);
        final List<Seat> availableSeats = SeatAvailabilityService.getAvailableSeats();
        return availableSeats.stream().map(Seat::getId).collect(Collectors.toList());
    }
}
