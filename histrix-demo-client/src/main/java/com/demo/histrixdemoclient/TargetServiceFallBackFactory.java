package com.demo.histrixdemoclient;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TargetServiceFallBackFactory implements FallbackFactory<TargetServiceClient2> {

    @Override
    public TargetServiceClient2 create(Throwable cause) {
        return () -> {
            TargetServiceFallBackFactory.log.error("target service call failed", cause);
            return "4567";
        };
    }
}
