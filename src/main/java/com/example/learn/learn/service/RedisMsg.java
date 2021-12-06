package com.example.learn.learn.service;

import org.springframework.stereotype.Component;

/**
 * @Author: majinwen
 * @Date: 2021/7/27-13:07
 * @Description:
 */
@Component
public interface RedisMsg {
     void receiveMessage(String message);
}
