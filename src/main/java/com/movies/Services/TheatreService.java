package com.movies.Services;

import java.util.HashMap;
import java.util.UUID;

import com.movies.Exceptions.NotFoundException;
import com.movies.Model.Screen;
import com.movies.Model.Seat;
import com.movies.Model.Theatre;

public class TheatreService {

    private final HashMap<String, Theatre> theatres;
    private final HashMap<String, Screen> screens;
    private final HashMap<String, Seat> seats;

    public TheatreService(){
        this.theatres = new HashMap<>();
        this.screens = new HashMap<>();
        this.seats = new HashMap<>();
    }

    public Theatre getTheatre(final String theatreId){
        if(!theatres.containsKey(theatreId)){
            throw new NotFoundException();
        }
        return theatres.get(theatreId);
    }

    public Screen getScreen(final String screenId){
        if(!screens.containsKey(screenId)){
            throw new NotFoundException();
        }
        return screens.get(screenId);
    }

    public Seat getSeat(final String seatId){
        if(!seats.containsKey(seatId)){
            throw new NotFoundException();
        }
        return seats.get(seatId);
    }


    public Theatre createTheatre(final String theatreName){
        String theatreId = UUID.randomUUID().toString();
        Theatre theatre = new Theatre(theatreId, theatreName);
        theatres.put(theatreId, theatre);
        return theatre;
    }

    public Screen createScreenInTheatre(final String screenName, final Theatre theatre){
        String screenId = UUID.randomUUID().toString();
        Screen screen = new Screen(screenId, screenName, theatre);
        screens.put(screenId, screen);
        theatre.addScreen(screen);
        return screen;
    }

    public Seat createSeatInScreen(final String seatNo, final String rowNo, final Screen screen){
        String seatId = UUID.randomUUID().toString();
        Seat seat = new Seat(seatId, seatNo, rowNo);
        screen.addSeat(seat);
        seats.put(seatId, seat);
        return seat;
    }   


    
}
