package com.demo.histrixdemoclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private TargetServiceClient targetServiceClient;

    @HystrixCommand(fallbackMethod = "getTimeoutStringFallBack",
            commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "6000") }
    )
    public String getTimeoutString() {
       return targetServiceClient.timeoutTest();
    }

    private String getTimeoutStringFallBack() {
        return "fall back String123";
    }

}
