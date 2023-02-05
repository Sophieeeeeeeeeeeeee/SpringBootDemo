package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Start Redis App
 * @author csy
 */
@SpringBootApplication
public class RedisApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        System.out.println("外部tomcat,chapter启动!");
        return application.sources(RedisApplication.class);
    }
}
