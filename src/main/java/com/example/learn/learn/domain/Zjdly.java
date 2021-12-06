package com.example.learn.learn.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 宅基地利用结构描述表
 */
@ApiModel("宅基地利用结构描述表")
@Data
public class Zjdly implements Serializable {
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
     * 宅基地代码
     */
    @ApiModelProperty("宅基地代码")
    private String zjddm;

    /**
     * 宅基地宗地标识码(增)
     */
    @ApiModelProperty("宅基地宗地标识码(增)")
    private String zjdzdxxbsm;

    /**
     * 宅基地利用状 况
     */
    @ApiModelProperty("宅基地利用状 况")
    private String zjdlyzk;

    /**
     * 宅基地闲置原 因
     */
    @ApiModelProperty("宅基地闲置原 因")
    private String zjdxzyy;

    /**
     * 宅基地闲置起
始时间

     */
    @ApiModelProperty("宅基地闲置起始时间")
    private Date zjdxzqssj;

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