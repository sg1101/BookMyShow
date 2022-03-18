package com.movies.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Screen {
    private String screenId;
    private String screenName;
    private List<Seat> seats;
    private Theatre theatre;
    
    public Screen(final String screenId, final String screenName, final Theatre theatre){
        this.screenId = screenId;
        this.screenName = screenName;
        this.theatre = theatre;
        this.seats = new ArrayList<> ();
    }

    public String getId(){
        return this.screenId;
    }

    public void addSeat(final Seat seat){
        this.seats.add(seat);
    }
}
