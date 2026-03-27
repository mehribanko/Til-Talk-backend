package com.tiltalkapi.tiltalk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tiltalkapi.tiltalk.app")
public class TilTalkBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TilTalkBackendApplication.class, args);
    }

}
