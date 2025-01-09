package com.lottecard.travel.domain.hotel.mapper;

import com.lottecard.travel.domain.hotel.entity.HotelEntity;
import com.lottecard.travel.domain.hotel.model.Hotel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-09T20:14:15+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20241217-1506, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel toModel(HotelEntity hotelEntity) {
        if ( hotelEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;
        Integer capacity = null;
        LocalDateTime createdAt = null;
        LocalDateTime updatedAt = null;

        id = hotelEntity.getId();
        name = hotelEntity.getName();
        description = hotelEntity.getDescription();
        capacity = hotelEntity.getCapacity();
        createdAt = hotelEntity.getCreatedAt();
        updatedAt = hotelEntity.getUpdatedAt();

        Hotel hotel = new Hotel( id, name, description, capacity, createdAt, updatedAt );

        return hotel;
    }

    @Override
    public HotelEntity toEntity(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        HotelEntity.HotelEntityBuilder hotelEntity = HotelEntity.builder();

        hotelEntity.capacity( hotel.capacity() );
        hotelEntity.createdAt( hotel.createdAt() );
        hotelEntity.description( hotel.description() );
        hotelEntity.id( hotel.id() );
        hotelEntity.name( hotel.name() );
        hotelEntity.updatedAt( hotel.updatedAt() );

        return hotelEntity.build();
    }
}
