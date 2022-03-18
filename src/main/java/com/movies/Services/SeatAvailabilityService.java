package com.movies.Services;

import com.movies.Providers.SeatLockProvider;

public class SeatAvailabilityService {
    private BookingService bookingService;
    private SeatLockProvider seatLockProvider;
    
    public SeatAvailabilityService(final BookingService bookingService, final SeatLockProvider seatLockProvider){
        this.bookingService = bookingService;
        this.seatLockProvider = seatLockProvider;
    }

    public List<Seat> getAvailableSeats(final Show show){
        final List<Seat> allSeats = show.getScreen().getSeats();
        final List<Seat> unavailableSeats = getUnavailableSeats(show);
        
    }

    private List<Seat> getUnavailableSeats(final Show show){
        final List<Seat> unavailableSeats = bookingService.getBookedSeats(show);
        unavailableSeats.addAll(seatLockProvider.getLockedSeats());
        return unavailableSeats;
    }
}
