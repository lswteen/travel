package com.lottecard.travel.hts.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Builder
public class HotelSearchResponse {
    private List<HotelDto> hotels;

    @Getter
    @Builder
    public static class HotelDto {
        private String hotelId;
        private String name;
        private String cityCode;
        private BigDecimal price;
        private List<String> amenities;
    }
}
