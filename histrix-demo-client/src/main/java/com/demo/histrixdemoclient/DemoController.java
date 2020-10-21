package com.demo.histrixdemoclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Autowired
    private TargetServiceClient targetServiceClient;

    @Autowired
    private TargetServiceClient2 targetServiceClient2;

    @GetMapping("/testTimeout")
    public String testTimeout() throws InterruptedException {
        return demoService.getTimeoutString();
    }

    @GetMapping("/testTimeout1")
    public String testTimeout1() {
        return targetServiceClient.timeoutTest();
    }

    @GetMapping("testTimeout2")
    public String testTimeout2() {
        return targetServiceClient2.timeoutTest();
    }
}
