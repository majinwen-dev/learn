package com.example.learn.learn.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 
 * 农户属性
 */
@ApiModel("农户属性")
@Data
public class Nh implements Serializable {
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
     * 所有权人bsm
     */
    @ApiModelProperty("所有权人bsm")
    private String suyqrbsm;

    /**
     * 所有权人代码
     */
    @ApiModelProperty("所有权人代码")
    private String suyqrdm;

    /**
     * 农户代码a
     */
    @ApiModelProperty("农户代码a")
    private String nhdm;

    /**
     * 户主姓名
     */
    @ApiModelProperty("户主姓名")
    private String hzxm;

    /**
     * 户主证件类型
     */
    @ApiModelProperty("户主证件类型")
    private String hzzjlx;

    /**
     * 户主证件号码
     */
    @ApiModelProperty("户主证件号码")
    private String hzzjhm;

    /**
     * 通讯地址
     */
    @ApiModelProperty("通讯地址")
    private String txdz;

    /**
     * 户内成员数量
     */
    @ApiModelProperty("户内成员数量")
    private Integer hncysl;

    /**
     * 是否五保户
     */
    @ApiModelProperty("是否五保户")
    private String sfwbh;

    /**
     * 是否贫困户
     */
    @ApiModelProperty("是否贫困户")
    private String sfpkh;

    /**
     * 是否有需求(增)
     */
    @ApiModelProperty("是否有需求(增)")
    private String sfyxq;

    /**
     * 是否有资格(增)
     */
    @ApiModelProperty("是否有资格(增)")
    private String sfyzg;

    /**
     * 数据来源
     */
    @ApiModelProperty("数据来源")
    private String sjly;

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

    private static final long serialVersionUID = 1L;
}