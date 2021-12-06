package com.example.learn.learn.conf.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 马金文
 * @Date: 2021/12/3 10:41
 * @Description:
 */
@ConfigurationProperties(prefix="com.learn.entitys")
@Configuration
@Data
public class EntitisConfiguration {
    /**
     * 数据批量导入配置类
     */
   private final ImportBatchesProperty importbatchesproperty;


}
