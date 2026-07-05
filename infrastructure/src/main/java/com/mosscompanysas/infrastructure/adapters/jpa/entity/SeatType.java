package com.mosscompanysas.infrastructure.adapters.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "seat_types")
public class SeatType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

}
