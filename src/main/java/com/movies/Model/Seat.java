package com.movies.Model;

public class Seat {
    private final String seatId;
    private final String rowNo;
    private final String seatNo;

    public Seat(String seatId, String seatNo, String rowNo){
        this.seatId = seatId;
        this.rowNo = rowNo;
        this.seatNo = seatNo;
    }

    public String getId(){
        return this.seatId;
    }
}
