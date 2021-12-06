package com.example.learn.learn.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.learn.learn.service.RedisMsg;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: majinwen
 * @Date: 2021/7/27-13:08
 * @Description:
 */
@Service("redisChannelSubService")
public class RedisChannelSubService implements RedisMsg {
    @Override
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
