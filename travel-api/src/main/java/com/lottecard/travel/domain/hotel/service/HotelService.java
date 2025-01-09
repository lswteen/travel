package com.lottecard.travel.domain.hotel.service;

import com.lottecard.travel.domain.hotel.entity.HotelEntity;
import com.lottecard.travel.domain.hotel.mapper.HotelMapper;
import com.lottecard.travel.domain.hotel.model.Hotel;
import com.lottecard.travel.domain.hotel.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelRepository hotelRepository;
    private final HotelMapper hotelMapper;

    public Hotel findById(Long id){
        HotelEntity entity = hotelRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("호텔 정보가 없습니다."));
        return hotelMapper.toModel(entity);
    }

    public List<Hotel> findAll(){
        List<HotelEntity> entities =  hotelRepository.findAll();
        return entities.stream()
                .map(hotelMapper::toModel)
                .collect(Collectors.toList());
    }

    public void save(Hotel hotel){
        hotelRepository.insert(hotelMapper.toEntity(hotel));
    }

    public void update(Hotel hotel){
        hotelRepository.update(hotelMapper.toEntity(hotel));
    }
}
