package com.lottecard.travel.app.hotel.mapper;

import com.lottecard.travel.app.hotel.controller.dto.HotelResponse;
import com.lottecard.travel.domain.hotel.model.Hotel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-16T15:21:37+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Homebrew)"
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
        hotelResponse.id( hotel.id() );
        hotelResponse.name( hotel.name() );
        hotelResponse.description( hotel.description() );
        hotelResponse.capacity( hotel.capacity() );

        return hotelResponse.build();
    }
}
