package com.mosscompanysas.domain.model.seat;

import com.mosscompanysas.domain.model.booking.Booking;
import com.mosscompanysas.domain.model.event.Event;
import com.mosscompanysas.domain.model.seat_type.SeatType;

public class Seat {
    private int ID;
    private String name;
    private Event event;
    private SeatType seatType;
    private Booking booking;
    private int seatNumber;
    private String status;
}
