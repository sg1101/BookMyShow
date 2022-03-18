package com.movies.Providers;

import java.util.List;

import com.movies.Model.Seat;
import com.movies.Model.Show;

public class SeatLockProvider {
    void lockSeats(Show show, List<Seat> seat, String user);
    void unlockSeats(Show show, List<Seat> seat, String user);
    boolean validateLock(Show show, Seat seat, String user);

    List<Seat> getLockedSeats(Show show);
}
