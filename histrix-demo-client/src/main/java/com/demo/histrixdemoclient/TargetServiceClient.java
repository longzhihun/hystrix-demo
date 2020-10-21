package com.demo.histrixdemoclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "target-service", url = "localhost:8080", fallback = TargetServiceFallBack.class)
public interface TargetServiceClient {

    @GetMapping("/tests/timeout")
    String timeoutTest();

}
