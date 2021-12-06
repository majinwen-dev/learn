package com.example.learn.learn.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 数据库表和实体名称映射枚举
 * @Author: 马金文
 * @Date: 2021/12/4 14:06
 * @Description:
 */
@Slf4j
public enum TableEntityMappingEnum {
    NH("nh","nh","农户表"),
    NHHNCY("nhhncy","nhhncy","农户户内成员"),
    NHTZ("nhtz","nhtz","农户台账"),
    NMFW("nmfw","nmfw","农民房屋"),
    NMFWLY("nmfwly","nmfwly","农民房屋利用"),
    QYTZ("qytz","qytz","区域台账"),
    SHYQR("shyqr","shyqr","使用权人"),
    SUYQR("suyqr","suyqr","所有权人"),
    ZJDLY("zjdly","zjdly","宅基地利用"),
    ZJDZDXX("zjdzdxx","zjdzdxx","宅基地宗地信息"),
    DEFAULT("","","默认表");
    /**
     * 表名称
     */
    private final String tableName;
    /**
     * 实体类名
     */
    private final String entityName;
    /**
     * 表注释
     */
    private final String description;


    TableEntityMappingEnum(String tableName, String entityName, String description) {
        this.tableName = tableName;
        this.entityName = entityName;
        this.description = description;
    }

    public String getTableName() {
        return tableName;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getDescription() {
        return description;
    }

    public static String change(String entityName){
        log.info("入参实体名:"+entityName);
        return Arrays.stream(TableEntityMappingEnum.values()).filter(a->(a.entityName.equals(entityName))).
                findAny().orElse(DEFAULT).tableName;
    }
}
