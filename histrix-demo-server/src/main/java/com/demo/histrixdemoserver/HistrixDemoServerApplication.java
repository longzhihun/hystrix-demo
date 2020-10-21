package com.demo.histrixdemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HistrixDemoServerApplication {

    @GetMapping("/tests/timeout")
    public String getTimeout() throws InterruptedException {
        Thread.sleep(13000);
        return "test timeout123";
    }

    public static void main(String[] args) {
        SpringApplication.run(HistrixDemoServerApplication.class, args);
    }

}
