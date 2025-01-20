package com.lottecard.travel.hts.client;

import com.lottecard.travel.hts.config.HtsFeignConfig;
import com.lottecard.travel.hts.dto.HotelSearchRequest;
import com.lottecard.travel.hts.dto.HotelSearchResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "htsHotelClient",
        url = "${hts.api.url}",
        configuration = HtsFeignConfig.class
)
public interface HtsHotelClient {
    @GetMapping("/v1/hotels")
    HotelSearchResponse searchHotels(@SpringQueryMap HotelSearchRequest request);

}
