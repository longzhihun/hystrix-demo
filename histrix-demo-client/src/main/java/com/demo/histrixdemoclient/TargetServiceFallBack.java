package com.demo.histrixdemoclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TargetServiceFallBack implements TargetServiceClient {

    @Override
    public String timeoutTest() {
        log.error("target service is down");
        throw new CustomException("target service down");
    }

}
