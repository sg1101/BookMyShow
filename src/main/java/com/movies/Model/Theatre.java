package com.movies.Model;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreId;
    private final String theatreName;
    private final List<Screen> screens;

    public Theatre(String theatreId, String theatreName){
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.screens = new ArrayList<>();
    }

    public String getId(){
        return this.theatreId;
    }

    public void addScreen(final Screen screen){
        screens.add(screen);
    }
}
