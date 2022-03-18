package com.movies.Controller;

import com.movies.Model.Theatre;
import com.movies.Services.TheatreService;

import com.movies.Model.Screen;

public class TheatreController {
    private TheatreService theatreService;

    public String createTheatre(final String theatreName){
        return theatreService.createTheatre(theatreName).getId();
    }

    public String createScreen(final String screenName, final String theatreId){
        Theatre theatre = theatreService.getTheatre(theatreId);
        return theatreService.createScreenInTheatre(screenName, theatre).getId();
    }

    public String createSeat(final String seatNo, final String rowNo, final String screenId){
        Screen screen = theatreService.getScreen(screenId);
        return theatreService.createSeatInScreen(seatNo, rowNo, screen).getId();
    }
}
