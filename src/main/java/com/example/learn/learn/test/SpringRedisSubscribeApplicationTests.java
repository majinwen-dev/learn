package com.example.learn.learn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: majinwen
 * @Date: 2021/7/27-10:28
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRedisSubscribeApplicationTests {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testSubscribe() {
        String channel = "topic";
        redisTemplate.convertAndSend(channel, "hello world");
    }
}
