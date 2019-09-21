package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class MySeluthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySeluthApplication.class, args);
    }

}
