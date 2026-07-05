package com.mosscompanysas.domain.model.seat_type.gateways;

import com.mosscompanysas.domain.model.seat_type.SeatType;

public interface seatTypeRepository {
    SeatType save(SeatType seatType);
    SeatType findById(String id);
}
