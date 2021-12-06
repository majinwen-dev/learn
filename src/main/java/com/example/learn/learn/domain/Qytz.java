package com.example.learn.learn.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 区域台账属性结构描述表
 */
@ApiModel("区域台账属性结构描述表")
@Data
public class Qytz implements Serializable {
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
     * 区域名称
     */
    @ApiModelProperty("区域名称")
    private String qymc;

    /**
     * 区域代码--行政区代码
     */
    @ApiModelProperty("区域代码--行政区代码")
    private String qydm;

    /**
     * 农户户数
     */
    @ApiModelProperty("农户户数")
    private Integer nhhs;

    /**
     * 农户总人口
     */
    @ApiModelProperty("农户总人口")
    private Integer nhzrk;

    /**
     * 所有权人数量
     */
    @ApiModelProperty("所有权人数量")
    private Integer suyqrsl;

    /**
     * 宅基地总宗数
     */
    @ApiModelProperty("宅基地总宗数")
    private Integer zjdzzs;

    /**
     * 宅基地总面积
     */
    @ApiModelProperty("宅基地总面积")
    private BigDecimal zjdzmj;

    /**
     * 总建筑面积
     */
    @ApiModelProperty("总建筑面积")
    private BigDecimal zjzmj;

    /**
     * 宅基地确权登记总宗数
     */
    @ApiModelProperty("宅基地确权登记总宗数")
    private Integer zjdqqdjzzs;

    /**
     * 宅基地确权登记总面积
     */
    @ApiModelProperty("宅基地确权登记总面积")
    private Long zjdqqdjzmj;

    /**
     * 宅基地超占总宗数
     */
    @ApiModelProperty("宅基地超占总宗数")
    private Integer zjdczzzs;

    /**
     * 宅基地超占总面积
     */
    @ApiModelProperty("宅基地超占总面积")
    private BigDecimal zjdczzmj;

    /**
     * 户均宅基地面积
     */
    @ApiModelProperty("户均宅基地面积")
    private BigDecimal hjzjdmj;

    /**
     * 户均宅基地宗数
     */
    @ApiModelProperty("户均宅基地宗数")
    private BigDecimal hjzjdzs;

    /**
     * 人均宅基地面积
     */
    @ApiModelProperty("人均宅基地面积")
    private BigDecimal rjzjdmj;

    /**
     * 人均宅基地宗数
     */
    @ApiModelProperty("人均宅基地宗数")
    private BigDecimal rjzjdzs;

    /**
     * ???
     */
    @ApiModelProperty("???")
    private Integer bccmsyzjdzs;

    /**
     * 非本村村民使用宅基地 宗数
     */
    @ApiModelProperty("非本村村民使用宅基地 宗数")
    private Integer fbccmsyzjdzs;

    /**
     * 一户一宅农户户数
     */
    @ApiModelProperty("一户一宅农户户数")
    private Integer yhyznhhs;

    /**
     * 一户多宅农户户数
     */
    @ApiModelProperty("一户多宅农户户数")
    private Integer yhdznhhs;

    /**
     * 宅基地流转宗数
     */
    @ApiModelProperty("宅基地流转宗数")
    private BigDecimal zjdlzzs;

    /**
     * 宅基地流转面积
     */
    @ApiModelProperty("宅基地流转面积")
    private BigDecimal zjdlzmj;

    /**
     * 宅基地抵押宗数
     */
    @ApiModelProperty("宅基地抵押宗数")
    private BigDecimal zjddyzs;

    /**
     * 宅基地抵押面积
     */
    @ApiModelProperty("宅基地抵押面积")
    private BigDecimal zjddymj;

    /**
     * 宅基地退出宗数
     */
    @ApiModelProperty("宅基地退出宗数")
    private BigDecimal zjdtczs;

    /**
     * 宅基地退出面积
     */
    @ApiModelProperty("宅基地退出面积")
    private BigDecimal zjdtcmj;

    /**
     * 宅基地有偿使用宗数
     */
    @ApiModelProperty("宅基地有偿使用宗数")
    private BigDecimal zjdycsyzs;

    /**
     * 宅基地有偿使用面积
     */
    @ApiModelProperty("宅基地有偿使用面积")
    private BigDecimal zjdycsymj;

    /**
     * 闲置宅基地宗数
     */
    @ApiModelProperty("闲置宅基地宗数")
    private BigDecimal xzzjdzs;

    /**
     * 闲置宅基地面积
     */
    @ApiModelProperty("闲置宅基地面积")
    private BigDecimal xzzjdmj;

    /**
     * 闲置农民房屋数量
     */
    @ApiModelProperty("闲置农民房屋数量")
    private BigDecimal xznmfwsl;

    /**
     * 闲置农民房屋面积
     */
    @ApiModelProperty("闲置农民房屋面积")
    private BigDecimal xznmfwmj;

    /**
     * 盘活利用农民房屋数量
     */
    @ApiModelProperty("盘活利用农民房屋数量")
    private BigDecimal phlynmfwsl;

    /**
     * 盘活利用农民房屋面积
     */
    @ApiModelProperty("盘活利用农民房屋面积")
    private BigDecimal phlynmfwmj;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String bz;

    private static final long serialVersionUID = 1L;
}