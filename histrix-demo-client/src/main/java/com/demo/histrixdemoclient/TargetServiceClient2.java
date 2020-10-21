package com.demo.histrixdemoclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "target-service2", url = "localhost:8080", fallbackFactory = TargetServiceFallBackFactory.class)
public interface TargetServiceClient2 {
    @GetMapping("/tests/timeout")
    String timeoutTest();
}
