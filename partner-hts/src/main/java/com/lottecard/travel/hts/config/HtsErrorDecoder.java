package com.lottecard.travel.hts.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lottecard.travel.exception.ApiException;
import com.lottecard.travel.type.ServiceErrorType;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.web.ErrorResponse;

import java.io.IOException;

public class HtsErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            ErrorResponse error = new ObjectMapper()
                    .readValue(response.body().asInputStream(), ErrorResponse.class);

            return switch (response.status()) {
                case 400 -> new ApiException(ServiceErrorType.EXTERNAL_ERROR);
                case 401 -> new ApiException(ServiceErrorType.EXTERNAL_ERROR);
                case 429 -> new ApiException(ServiceErrorType.EXTERNAL_ERROR);
                default -> new ApiException(ServiceErrorType.EXTERNAL_ERROR);
            };
        } catch (IOException e) {
            return new ApiException(ServiceErrorType.EXTERNAL_ERROR);
        }
    }
}
