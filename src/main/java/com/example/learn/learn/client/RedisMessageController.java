package com.example.learn.learn.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 马金文
 * @Date: 2021/11/16 13:38
 * @Description:
 */
@Api(tags = "redis消息队列",value = "redis消息队列")
@RestController
@RequestMapping("/redisMessage")
public class RedisMessageController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @ApiOperation("发送消息")
    @GetMapping("/sendMessage")
    public void sendMessage(){
            stringRedisTemplate.convertAndSend("topictest","hello world");
            stringRedisTemplate.convertAndSend("pmptopic","hello world");
    }

    @ApiOperation("队列")
    @GetMapping("/messagequeue")
    public void messagequeue(){
        for (int i=0;i<=200;i++){
            stringRedisTemplate.opsForList().leftPush("temp","a"+i);
        }
    }
    @ApiOperation("获取队列消息")
    @GetMapping("/getMessage")
    public String getMessage(){
        return stringRedisTemplate.opsForList().leftPop("temp");
    }


}
