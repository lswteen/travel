package com.lottecard.travel.app.hotel.service;

import com.lottecard.travel.app.hotel.controller.dto.HotelResponse;
import com.lottecard.travel.app.hotel.mapper.HotelWebMapper;
import com.lottecard.travel.domain.hotel.model.Hotel;
import com.lottecard.travel.domain.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelWebService {
    private final HotelService hotelService;
    private final HotelWebMapper hotelWebMapper;

    public List<HotelResponse> getAllHotels(){
        List<Hotel> hotels =  hotelService.findAll();
        return hotels.stream()
                .map(hotelWebMapper::toResponse)
                .collect(Collectors.toList());
    }
}
