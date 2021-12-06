package com.example.learn.learn.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.learn.learn.service.RedisMsg;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: majinwen
 * @Date: 2021/7/27-17:28
 * @Description:
 */
@Service("redisPmpSubService")
public class RedisPmpSubService implements RedisMsg {
    @Override
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
