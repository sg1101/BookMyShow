package com.movies.Services;

import java.util.HashMap;
import java.util.UUID;

import com.movies.Exceptions.NotFoundException;
import com.movies.Exceptions.SeatNotFoundException;
import com.movies.Model.Movie;
import com.movies.Model.Screen;
import com.movies.Model.Show;

public class ShowService {
    private HashMap<String, Show> shows;

    public void showService(){
        this.shows = new HashMap<>();
    }

    public Show getShow(final String showId){
        if(!shows.containsKey(showId)){
            throw new NotFoundException();
        }
        return shows.get(showId);
    }

    public Show createShow(final Screen screen, final Movie movie, final String startTime, final Integer durationInSeconds){
        if(!checkShowCreationAllowed(screen, startTime, durationInSeconds)){
            throw new SeatNotFoundException();
        }
        String showId = UUID.randomUUID().toString();
        Show show = new Show(showId, movie, screen, startTime, durationInSeconds);
        this.shows.put(showId, show);
        return show;
    }

    public boolean checkShowCreationAllowed(final Screen screen, final String startTime, final Integer durationInSeconds){
        return true;
    }
}
