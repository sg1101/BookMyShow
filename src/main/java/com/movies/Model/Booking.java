package com.movies.Model;

import java.util.List;

public class Booking {
    private final String bookingId;
    private final Show show;
    private final List<Seat> seatsBooked;
    private final String userId;
    private BookingStatus bookingStatus;

    public Booking(final String bookingId, final Show show, final List<Seat> seatsBooked, final String userId, BookingStatus bookingStatus){
        this.bookingId = bookingId;
        this.show = show;
        this.seatsBooked = seatsBooked;
        this.userId = userId;
        this.bookingStatus = BookingStatus.Created;
    }

    public boolean isConfirmed(){
        return this.bookingStatus = BookingStatus.Confirmed;
    }

    public void confirmBooking(){
        if(this.bookingStatus!=BookingStatus.Created){
            throw new InvalidStateException();
        }
        this.bookingStatus = BookingStatus.Confirmed;
    }

    public void expireBooking() {
        if (this.bookingStatus != BookingStatus.Created) {
            throw new InvalidStateException();
        }
        this.bookingStatus = BookingStatus.Expired;
    }
}
