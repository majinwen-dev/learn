package com.example.learn.learn.conf.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 数据批量导入配置类
 * @Author: 马金文
 * @Date: 2021/12/3 10:49
 * @Description:
 */
@Data
@Component
public class ImportBatchesProperty {
    /**
     * 文件存储基础路径
     */
    private String acessFileBasicPath;
    /**
     * 读取数据表名
     */
    private final List<String> tableNames;
}
