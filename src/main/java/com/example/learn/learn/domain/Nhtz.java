package com.example.learn.learn.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 农户台账属性
 */
@ApiModel("农户台账属性")
@Data
public class Nhtz implements Serializable {
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
     * 农户代码
     */
    @ApiModelProperty("农户代码")
    private String nhdm;

    /**
     * 农户bsm(增)
     */
    @ApiModelProperty("农户bsm(增)")
    private String nhbsm;

    /**
     * 所有权人代码
     */
    @ApiModelProperty("所有权人代码")
    private String suyqrdm;

    /**
     * 所有权人bsm
     */
    @ApiModelProperty("所有权人bsm")
    private String suyqrbsm;

    /**
     * 使用权人代码
     */
    @ApiModelProperty("使用权人代码")
    private String shyqrdm;

    /**
     * 使用权人标识码(增)
     */
    @ApiModelProperty("使用权人标识码(增)")
    private String shyqrbsm;

    /**
     * 户内成员数量
     */
    @ApiModelProperty("户内成员数量")
    private Integer hncysl;

    /**
     * 宅基地宗数
     */
    @ApiModelProperty("宅基地宗数")
    private BigDecimal zjdzs;

    /**
     * 宅基地代码
     */
    @ApiModelProperty("宅基地代码")
    private String zjddm;

    /**
     * 宅地基宗地标识码(增)
     */
    @ApiModelProperty("宅地基宗地标识码(增)")
    private String zjdzdbsm;

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
     * 农民房屋数量
     */
    @ApiModelProperty("农民房屋数量")
    private BigDecimal nmfwsl;

    /**
     * 宅基地宗地面积
     */
    @ApiModelProperty("宅基地宗地面积")
    private BigDecimal zjdzdmj;

    /**
     * 宅基地批准面积
     */
    @ApiModelProperty("宅基地批准面积")
    private BigDecimal zjdpzmj;

    /**
     * 户内成员人均宅基地 面积
     */
    @ApiModelProperty("户内成员人均宅基地 面积")
    private BigDecimal hncyrjzjdmj;

    /**
     * 宅基地确权登记面积
     */
    @ApiModelProperty("宅基地确权登记面积")
    private BigDecimal zjdqqdjmj;

    /**
     * 宅基地超占面积
     */
    @ApiModelProperty("宅基地超占面积")
    private BigDecimal zjdczmj;

    /**
     * 总建筑面积
     */
    @ApiModelProperty("总建筑面积")
    private BigDecimal zjzmj;

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
     * 宅基地流转面积
     */
    @ApiModelProperty("宅基地流转面积")
    private BigDecimal zjdlzmj;

    /**
     * 宅基地有偿使用面积
     */
    @ApiModelProperty("宅基地有偿使用面积")
    private BigDecimal zjdycsymj;

    /**
     * 宅基地有偿使用费用
     */
    @ApiModelProperty("宅基地有偿使用费用")
    private BigDecimal zjdycsyfy;

    /**
     * 宅基地退出面积
     */
    @ApiModelProperty("宅基地退出面积")
    private BigDecimal zjdtcmj;

    /**
     * 宅基地退出补偿金额
     */
    @ApiModelProperty("宅基地退出补偿金额")
    private BigDecimal zjdtcbcje;

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