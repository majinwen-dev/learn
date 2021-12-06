package com.example.learn.learn.conf;

import com.example.learn.learn.service.RedisMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @Author: majinwen
 * @Date: 2021/7/30-9:26
 * @Description:
 */
@Configuration
public class RedisMessageConf {

   private final static Logger logger= LoggerFactory.getLogger(RedisMessageConf.class);

   @Autowired
   @Qualifier(value = "redisChannelSubService")
   RedisMsg redisChannelSubService;
   @Autowired
   @Qualifier(value = "redisPmpSubService")
   RedisMsg redisPmpSubService;

   @Bean
    public RedisMessageListenerContainer container(RedisConnectionFactory redisConnectionFactory){
       RedisMessageListenerContainer container=new RedisMessageListenerContainer();
       container.setConnectionFactory(redisConnectionFactory);
       // 订阅一个通道 topictest
       container.addMessageListener(listenerAdapter(redisChannelSubService),new PatternTopic("topictest"));
       // 订阅另一个通道
       container.addMessageListener(listenerAdapter(redisPmpSubService),new PatternTopic("pmptopic"));

       logger.info("订阅两个通道 topictest  pmptopic");
       return container;
   }
   @Bean
    public MessageListenerAdapter listenerAdapter(RedisMsg redisMsg){
       logger.info("添加一个消息处理的POJO");
       return new MessageListenerAdapter(redisMsg,"receiveMessage");
   }

}
