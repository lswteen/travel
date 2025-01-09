package com.lottecard.travel.app.hotel.mapper;

import com.lottecard.travel.app.hotel.controller.dto.HotelResponse;
import com.lottecard.travel.domain.hotel.model.Hotel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-09T20:14:46+0900",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20241217-1506, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class HotelWebMapperImpl implements HotelWebMapper {

    @Override
    public HotelResponse toResponse(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        HotelResponse.HotelResponseBuilder hotelResponse = HotelResponse.builder();

        hotelResponse.createdAt( map( hotel.createdAt() ) );
        hotelResponse.updatedAt( map( hotel.updatedAt() ) );
        hotelResponse.capacity( hotel.capacity() );
        hotelResponse.description( hotel.description() );
        hotelResponse.id( hotel.id() );
        hotelResponse.name( hotel.name() );

        return hotelResponse.build();
    }
}
