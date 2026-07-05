package com.mosscompanysas.domain.model.seat.gateways;

import com.mosscompanysas.domain.model.seat.Seat;

public interface seatRepository {
    Seat save(Seat seat);
    Seat findById(String id);
}
