package com.mosscompanysas.domain.model.event_prices;

import com.mosscompanysas.domain.model.event.Event;
import com.mosscompanysas.domain.model.seat_type.SeatType;

import java.util.Date;

public class EventPrice {

    private int ID;
    private Event event;
    private SeatType seatType;
    private int basePrice;
    private int currentPrice;
    private Date createdAt;
}
