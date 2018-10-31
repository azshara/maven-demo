package com.stormragetech.demo.springcloud.provider.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * description: //TODO
 *
 * @author: Xue Bin
 * @version: 1.0.0-SNAPSHOT
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Launch {

    public static void main(String[] args) {
        SpringApplication.run(Launch.class, args);
    }

}

