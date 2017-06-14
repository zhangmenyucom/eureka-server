package com.taylor.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xiaolu.zhang
 * @date: 2017/6/14 21:38
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String... args) {

        new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
    }
}
