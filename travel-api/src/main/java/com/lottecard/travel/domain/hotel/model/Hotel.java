package com.lottecard.travel.domain.hotel.model;

import java.time.LocalDateTime;

public record Hotel (
                Long id,
                String name,
                String description,
                Integer capacity,
                LocalDateTime createdAt,
                LocalDateTime updatedAt
){
}
