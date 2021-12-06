package com.example.learn.learn.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 农民房屋利用情况
 */
@ApiModel("农民房屋利用情况")
@Data
public class Nmfwly implements Serializable {
    /**
     * 标识码
     */
    @ApiModelProperty("标识码")
    private String bsm;

    /**
     * 要素代码
     */
    @ApiModelProperty("要素代码")
    private String ysdm;

    /**
     * 农民房屋代码
     */
    @ApiModelProperty("农民房屋代码")
    private String nmfwdm;

    /**
     * 农民房屋标识码(增)
     */
    @ApiModelProperty("农民房屋标识码(增)")
    private String nmfwbsm;

    /**
     * 房屋状态
     */
    @ApiModelProperty("房屋状态")
    private String fwzt;

    /**
     * 房屋安全性鉴
定等级

     */
    @ApiModelProperty("房屋安全性鉴定等级")
    private String fwaqxjddj;

    /**
     * 利用状况
     */
    @ApiModelProperty("利用状况")
    private String lyzk;

    /**
     * 房屋是否闲置
     */
    @ApiModelProperty("房屋是否闲置")
    private String fwsfxz;

    /**
     * 房屋闲置原因
     */
    @ApiModelProperty("房屋闲置原因")
    private String fwxzyy;

    /**
     * 房屋闲置起始
时间

     */
    @ApiModelProperty("房屋闲置起时间")
    private Date fwxzqssj;

    /**
     * 盘活利用模式
     */
    @ApiModelProperty("盘活利用模式")
    private String phlyms;

    /**
     * 年收益
     */
    @ApiModelProperty("年收益")
    private BigDecimal nsy;

    /**
     * 现场照片-东
     */
    @ApiModelProperty("现场照片-东")
    private String xczpd;

    /**
     * 现场照片-南
     */
    @ApiModelProperty("现场照片-南")
    private String xczpn;

    /**
     * 现场照片-西
     */
    @ApiModelProperty("现场照片-西")
    private String xczpx;

    /**
     * 现场照片-北
     */
    @ApiModelProperty("现场照片-北")
    private String xczpb;

    /**
     * 调査时间
     */
    @ApiModelProperty("调査时间")
    private Date dcsj;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String bz;

    /**
     * 创建者
     */
    @ApiModelProperty("创建者")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新者
     */
    @ApiModelProperty("更新者")
    private String editBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date editTime;

    /**
     * 行政区代码(增)
     */
    @ApiModelProperty("行政区代码(增)")
    private String xzqdm;

    private static final long serialVersionUID = 1L;
}