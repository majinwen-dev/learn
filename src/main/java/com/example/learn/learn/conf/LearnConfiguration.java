package com.example.learn.learn.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: majinwen
 * @Date: 2021/8/26-15:44
 * @Description:
 */
@Configuration
public class LearnConfiguration {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
