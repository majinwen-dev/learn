package com.example.learn.learn.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author: majinwen
 * @Date: 2021/7/27-10:09
 * @Description:
 */
public class ConsumerRedisListener implements MessageListener {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void onMessage(Message message, byte[] pattern) {
        doBusiness(message);
    }

    /**
     * 打印 message body 内容
     *
     * @param message
     */
    public void doBusiness(Message message) {
        Object value = redisTemplate.getValueSerializer().deserialize(message.getBody());
        System.out.println("consumer message: " + value.toString());
    }
}
