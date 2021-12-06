package com.example.learn.learn;

import com.example.learn.learn.service.RedisMsg;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.example.learn.learn.dao")
@EnableAsync
public class LearnApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LearnApplication.class, args);
        RedisMsg redisChannelSubService = (RedisMsg) run.getBean("redisChannelSubService");
        System.out.println(redisChannelSubService);
    }
}
