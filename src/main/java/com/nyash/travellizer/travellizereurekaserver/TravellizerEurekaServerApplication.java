package com.nyash.travellizer.travellizereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TravellizerEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravellizerEurekaServerApplication.class, args);
    }

}
