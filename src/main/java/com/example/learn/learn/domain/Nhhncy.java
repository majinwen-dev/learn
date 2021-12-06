package com.example.learn.learn.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 
 * 农户户内成员属性
 */
@ApiModel("农户户内成员属性")
@Data
public class Nhhncy implements Serializable {
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
     * 农户bsm(增)
     */
    @ApiModelProperty("农户bsm(增)")
    private String nhbsm;

    /**
     * 农户代码
     */
    @ApiModelProperty("农户代码")
    private String nhdm;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    private String xm;

    /**
     * 证件类型
     */
    @ApiModelProperty("证件类型")
    private String zjlx;

    /**
     * 户口所在地名称(增)
     */
    @ApiModelProperty("户口所在地名称(增)")
    private String hkszdmc;

    /**
     * 户口所在地(增)
     */
    @ApiModelProperty("户口所在地(增)")
    private String hkszd;

    /**
     * 证件号码
     */
    @ApiModelProperty("证件号码")
    private String zjhm;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private String xb;

    /**
     * 与户主关系名称(增)
     */
    @ApiModelProperty("与户主关系名称(增)")
    private String yhzgxmc;

    /**
     * 与户主关系b
     */
    @ApiModelProperty("与户主关系b")
    private String yhzgx;

    /**
     * 户口类型
     */
    @ApiModelProperty("户口类型")
    private String hklx;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    private String lxdh;

    /**
     * 婚姻状况
     */
    @ApiModelProperty("婚姻状况")
    private String hyzk;

    /**
     * 是否本集体经济组织成员(改)
     */
    @ApiModelProperty("是否本集体经济组织成员(改)")
    private String sfbjtjjzzcy;

    /**
     * 成员备注
     */
    @ApiModelProperty("成员备注")
    private String cybz;

    /**
     * 成员备注说明
     */
    @ApiModelProperty("成员备注说明")
    private String cybzsm;

    /**
     * 数据来源
     */
    @ApiModelProperty("数据来源")
    private String sjly;

    /**
     * 关系序号(增)
     */
    @ApiModelProperty("关系序号(增)")
    private String gxxh;

    /**
     * 大户号(增)
     */
    @ApiModelProperty("大户号(增)")
    private String dhh;

    /**
     * 上一辈身份证号(增)
     */
    @ApiModelProperty("上一辈身份证号(增)")
    private String sybsfzh;

    /**
     * 配偶身份证号(增)
     */
    @ApiModelProperty("配偶身份证号(增)")
    private String posfzh;

    /**
     * 是否标准户户主(增)
     */
    @ApiModelProperty("是否标准户户主(增)")
    private String sfbzhhz;

    /**
     * 行政区代码(增)
     */
    @ApiModelProperty("行政区代码(增)")
    private String xzqdm;

    /**
     * 创建者(增)
     */
    @ApiModelProperty("创建者(增)")
    private String createBy;

    /**
     * 创建时间(增)
     */
    @ApiModelProperty("创建时间(增)")
    private Date createTime;

    /**
     * 更新者(增)
     */
    @ApiModelProperty("更新者(增)")
    private String editBy;

    /**
     * 更新时间(增)
     */
    @ApiModelProperty("更新时间(增)")
    private Date editTime;

    private static final long serialVersionUID = 1L;
}