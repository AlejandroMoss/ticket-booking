package com.mosscompanysas.infrastructure.web.controller;


import com.mosscompanysas.infrastructure.web.dto.EjemploRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ejemplos")
public class EjemploController {

    public EjemploController() {
    }

    @PostMapping
    public ResponseEntity crear(@Valid @RequestBody EjemploRequest request) {

        return null;
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "service", "ticket-bookingv3"
        ));
    }
}
