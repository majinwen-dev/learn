package com.example.learn.learn.task;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 马金文
 * @Date: 2021/10/19 8:53
 * @Description:
 */
@Data
public class ScheduleConfigDO {
    /**
     * 自增主键
     */
    private Integer id;
    /**
     * 定时任务名称
     */
    private String jobName;
    /**
     * 类名称
     */
    private String className;
    /**
     * 方法
     */
    private String method;
    /**
     * cron 表达式
     */
    private String cron;
    /**
     * 状态:1正常,0停用
     */
    private Integer enabled;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新人
     */
    private String updateBy;

}
