package com.zhangtianfeng.yyzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class YyzxApplication {

    public static void main(String[] args) {
        SpringApplication.run(YyzxApplication.class, args);
    }

}
