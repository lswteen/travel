package com.lottecard.travel.domain.hotel.mapper;

import com.lottecard.travel.domain.hotel.entity.HotelEntity;
import com.lottecard.travel.domain.hotel.model.Hotel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HotelMapper {
    Hotel toModel(HotelEntity hotelEntity);

    HotelEntity toEntity(Hotel hotel);

}
