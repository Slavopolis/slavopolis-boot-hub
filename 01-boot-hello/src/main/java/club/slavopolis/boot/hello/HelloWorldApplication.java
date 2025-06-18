package club.slavopolis.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot 服务启动入口
 *
 * @author slavopolis
 * @version 1.0.0
 * @since 2025/6/18
 * <p>
 * Copyright (c) 2025 slavopolis-boot-hub
 * All rights reserved.
 */
@RestController
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! 欢迎使用 Spring Boot 3.5.0！";
    }
}
