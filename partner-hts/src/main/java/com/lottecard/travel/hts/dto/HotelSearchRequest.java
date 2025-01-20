package com.lottecard.travel.hts.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class HotelSearchRequest {
    private String cityCode;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer adults;
    private Integer children;
    private String roomType;
}
