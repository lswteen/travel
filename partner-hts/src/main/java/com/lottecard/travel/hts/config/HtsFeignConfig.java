package com.lottecard.travel.hts.config;

import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

public class HtsFeignConfig {
    @Bean
    public RequestInterceptor htsRequestInterceptor() {
        return template -> {
            template.header("X-API-KEY", "${hts.api.key}");
            template.header("X-Channel", "LOTTE_CARD");
            template.header("X-Transaction-ID", UUID.randomUUID().toString());
        };
    }

    @Bean
    public ErrorDecoder htsErrorDecoder() {
        return new HtsErrorDecoder();
    }
}
