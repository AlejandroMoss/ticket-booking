package com.mosscompanysas.infrastructure.adapters.jpa.entity;

import com.mosscompanysas.infrastructure.adapters.jpa.entity.persistence.SeatStatusEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "seats", indexes = @Index(name = "idx_seats_event_status", columnList = "event_id, status"))
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_type_id", nullable = false)
    private SeatType seatType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @Column(name = "seat_number", nullable = false, length = 50)
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private SeatStatusEntity status = SeatStatusEntity.AVAILABLE;

}
